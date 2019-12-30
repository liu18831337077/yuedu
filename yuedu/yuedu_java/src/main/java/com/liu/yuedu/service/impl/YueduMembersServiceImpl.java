package com.liu.yuedu.service.impl;

import com.liu.yuedu.mapper.YueduArticlesMapper;
import com.liu.yuedu.mapper.YueduMembersMapper;
import com.liu.yuedu.pojo.*;
import com.liu.yuedu.service.YueduMembersService;
import com.liu.yuedu.vo.YueduMembersVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class YueduMembersServiceImpl implements YueduMembersService {

    @Autowired
    YueduMembersMapper yueduMembersMapper;
    @Autowired
    YueduArticlesMapper yueduArticlesMapper;
    @Override
    public Map<String,Object> login(YueduMembers members) {
        Map<String, Object> resultMap = new HashMap<>();
        //查询数据库看是否存在
        String u_openid = members.getU_openid();
        YueduMembersExample yueduMembersExample = new YueduMembersExample();
        YueduMembersExample.Criteria criteria = yueduMembersExample.createCriteria();
        criteria.andU_openidEqualTo(u_openid);
        List<YueduMembers> yueduMembers = yueduMembersMapper.selectByExample(yueduMembersExample);
        //如果存在则提示登录成功
        if(yueduMembers.size()>0){
            resultMap.put("data",yueduMembers.get(0));
            resultMap.put("code","1");
            return resultMap;
        }
        //如果不存在则进行注册
        members.setU_random(UUID.randomUUID().toString());
        members.setU_regtime(new Date());
        members.setU_integral(0);
        yueduMembersMapper.insert(members);
        resultMap.put("data",members);
        resultMap.put("code","2");
        return resultMap;
    }

    @Override
    public YueduMembersVo getMembersById(Integer id) {
        //设置用户文章个数的属性
        YueduArticlesExample yueduArticlesExample = new YueduArticlesExample();
        YueduArticlesExample.Criteria criteria = yueduArticlesExample.createCriteria();
        criteria.andArt_uidEqualTo(id);
        List<YueduArticles> yueduArticles = yueduArticlesMapper.selectByExample(yueduArticlesExample);
        YueduMembers yueduMembers = yueduMembersMapper.selectByPrimaryKey(id);
        YueduMembersVo yueduMembersVo = new YueduMembersVo();
        BeanUtils.copyProperties(yueduMembers,yueduMembersVo);
        yueduMembersVo.setArtCount(yueduArticles.size());
        return yueduMembersVo;
    }
}
