package com.liu.yuedu.service;

import com.liu.yuedu.pojo.YueduCategories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 分类
 */
public interface YueduCategoriesService {


    /**
     * 查询所有分类
     * @return
     */
    List<YueduCategories> getAll();

    /**
     * 根据父id查询分类
     * @return
     */
    public List<YueduCategories> getByPid(Integer pid);

    /**
     * 根据id查询分类
     * @return
     */
    public YueduCategories getById(Integer id);
}
