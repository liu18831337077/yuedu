package com.liu.yuedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.yuedu.mapper.YueduArticlesMapper;
import com.liu.yuedu.mapper.YueduMembersMapper;
import com.liu.yuedu.pojo.YueduArticles;
import com.liu.yuedu.pojo.YueduArticlesExample;
import com.liu.yuedu.pojo.YueduMembers;
import com.liu.yuedu.service.YueduArticlesService;
import com.liu.yuedu.vo.YueduArticlesVo;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class YueduArticlesServiceImpl implements YueduArticlesService {

    @Autowired
    YueduArticlesMapper yueduArticlesMapper;
    @Autowired
    YueduMembersMapper yueduMembersMapper;
    /**
     * 添加文章，修改用户积分等
     * @param yueduArticles
     * @return
     */
    @Override
    public Map<String, Object> addArticle(YueduArticles yueduArticles) {
        Map<String, Object> resultMap= new HashMap<String, Object>();
        //增加用户积分
        YueduMembers yueduMembers = yueduMembersMapper.selectByPrimaryKey(yueduArticles.getArt_uid());
        yueduMembers.setU_integral(yueduMembers.getU_integral()+10);
        int updateUserResult = yueduMembersMapper.updateByPrimaryKey(yueduMembers);
        //上传文章
        yueduArticles.setArt_createtime(new Date());
        int insertResult = yueduArticlesMapper.insert(yueduArticles);
        if((insertResult+updateUserResult)<2){
            resultMap.put("status","no");
            return resultMap;
        }else{
            //修改成功则返回修改后的用户
            resultMap.put("status","ok");
        }
        return resultMap;
    }

    @Override
    public PageInfo<YueduArticles> getArticlePageByUserId(Integer uid, Integer page) {
        PageHelper.startPage(page, 6);
        YueduArticlesExample yueduArticlesExample = new YueduArticlesExample();
        if(uid!=null){
            YueduArticlesExample.Criteria criteria = yueduArticlesExample.createCriteria();
            criteria.andArt_uidEqualTo(uid);
        }
        yueduArticlesExample.setOrderByClause("art_id DESC");
        List<YueduArticles> yueduArticles = yueduArticlesMapper.selectByExampleWithBLOBs(yueduArticlesExample);
        PageInfo<YueduArticles> pageInfo = new PageInfo<YueduArticles>(yueduArticles);
        return pageInfo;
    }

    @Override
    public int removeArt(Integer artId) {
        return yueduArticlesMapper.deleteByPrimaryKey(artId);
    }

    @Override
    public YueduArticlesVo getArticleById(Integer id) {
        YueduArticlesVo articlesVo= new YueduArticlesVo();
        YueduArticlesExample yueduArticlesExample = new YueduArticlesExample();
        YueduArticlesExample.Criteria criteria = yueduArticlesExample.createCriteria();
        criteria.andArt_idEqualTo(id);
        List<YueduArticles> articlesList= yueduArticlesMapper.selectByExampleWithBLOBs(yueduArticlesExample);
        if(articlesList.size()>0){
            YueduArticles articles=articlesList.get(0);
            BeanUtils.copyProperties(articles,articlesVo);
            YueduMembers memBers= yueduMembersMapper.selectByPrimaryKey(articlesVo.getArt_uid());
            articlesVo.setU_face(memBers.getU_face());
            articlesVo.setU_name(memBers.getU_name());
        }
        return articlesVo;
    }

    @Override
    public int updateArticle(YueduArticles yueduArticles) {
        return yueduArticlesMapper.updateByPrimaryKeyWithBLOBs(yueduArticles);
    }

    @Override
    public PageInfo<YueduArticles> getArticlesByCateAndPage(Integer art_cate, Integer page) {
        PageHelper.startPage(page, 6);
        YueduArticlesExample yueduArticlesExample = new YueduArticlesExample();
        YueduArticlesExample.Criteria criteria = yueduArticlesExample.createCriteria();
        if(!art_cate.equals(0)){
            criteria.andArt_cateEqualTo(art_cate);
        }
        yueduArticlesExample.setOrderByClause("art_id DESC");
        List<YueduArticles> yueduArticles = yueduArticlesMapper.selectByExampleWithBLOBs(yueduArticlesExample);
        PageInfo<YueduArticles> pageInfo = new PageInfo<YueduArticles>(yueduArticles);
        return pageInfo;
    }


}
