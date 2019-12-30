package com.liu.yuedu.controller;

import com.liu.yuedu.pojo.YueduMembers;
import com.liu.yuedu.service.YueduMembersService;
import com.liu.yuedu.vo.YueduMembersVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/members")
public class YueduMembersController {

    @Autowired
    YueduMembersService yueduMembersService;

    @PostMapping("/wxLogin")
    public Map<String,Object> login(@RequestBody Map<String,String> map){
        String openid = map.get("openid");
        String name = map.get("name");
        String face = map.get("face");
        YueduMembers yueduMembers = new YueduMembers();
        yueduMembers.setU_openid(openid);
        yueduMembers.setU_name(name);
        yueduMembers.setU_face(face);
        Map<String, Object> loginMap = yueduMembersService.login(yueduMembers);
        Map<String, Object> resultMap = new HashMap<>();

        if(loginMap.get("code").equals("1")){
            resultMap.put("msg","登录成功");
            resultMap.put("code","200");
            resultMap.put("data",loginMap.get("data"));
            return resultMap;
        }else{
            resultMap.put("msg","注册成功");
            resultMap.put("code","200");
            resultMap.put("data",loginMap.get("data"));
            return resultMap;
        }
    }
    @GetMapping("/getMembersVoById")
    public YueduMembersVo getMembersById(Integer id){
        return yueduMembersService.getMembersById(id);
    }
}
