package com.liu.yuedu.service;

import com.liu.yuedu.pojo.YueduMembers;
import com.liu.yuedu.vo.YueduMembersVo;

import java.util.Map;

/**
 * 用户
 */
public interface YueduMembersService {

    /**
     * 微信登录的方法，如果用户不存在则注册,返回登录成功的用户的信息
     */
    public Map<String,Object> login(YueduMembers members);

    YueduMembersVo getMembersById(Integer id);
}
