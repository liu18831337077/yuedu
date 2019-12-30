package com.liu.yuedu.service.impl;

import com.liu.yuedu.mapper.YueduCategoriesMapper;
import com.liu.yuedu.pojo.YueduCategories;
import com.liu.yuedu.pojo.YueduCategoriesExample;
import com.liu.yuedu.service.YueduCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YueduCategoriesServiceImpl implements YueduCategoriesService {

    @Autowired
    YueduCategoriesMapper yueduCategoriesMapper;

    @Override
    public List<YueduCategories> getAll() {
        return yueduCategoriesMapper.selectByExample(new YueduCategoriesExample());
    }

    @Override
    public List<YueduCategories> getByPid(Integer pid) {
        YueduCategoriesExample yueduCategoriesExample = new YueduCategoriesExample();
        YueduCategoriesExample.Criteria criteria = yueduCategoriesExample.createCriteria();
        criteria.andCate_pidEqualTo(pid);
        return yueduCategoriesMapper.selectByExample(yueduCategoriesExample);
    }

    @Override
    public YueduCategories getById(Integer id) {
        return yueduCategoriesMapper.selectByPrimaryKey(id);
    }
}
