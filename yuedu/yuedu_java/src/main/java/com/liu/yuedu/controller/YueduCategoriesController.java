package com.liu.yuedu.controller;

import com.liu.yuedu.pojo.YueduCategories;
import com.liu.yuedu.service.YueduCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class YueduCategoriesController {

    @Autowired
    YueduCategoriesService yueduCategoriesService;
    /**
     * 查询所有分类
     * @return
     */
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<YueduCategories> getAll(){
        return yueduCategoriesService.getAll();
    }


    /**
     * 根据父id查询子分类
     * @return
     */
    @RequestMapping(value = "/getByPid",method = RequestMethod.GET)
    public List<YueduCategories> getByPid(@RequestParam("pid") Integer pid){
        return yueduCategoriesService.getByPid(pid);
    }

    /**
     * 根据id查询分类
     * @return
     */
    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public YueduCategories getById(@RequestParam("id") Integer id){
        return yueduCategoriesService.getById(id);
    }
}