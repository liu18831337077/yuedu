package com.liu.yuedu.mapper;

import com.liu.yuedu.pojo.YueduCategories;
import com.liu.yuedu.pojo.YueduCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YueduCategoriesMapper {
    int countByExample(YueduCategoriesExample example);

    int deleteByExample(YueduCategoriesExample example);

    int deleteByPrimaryKey(Integer cate_id);

    int insert(YueduCategories record);

    int insertSelective(YueduCategories record);

    List<YueduCategories> selectByExample(YueduCategoriesExample example);

    YueduCategories selectByPrimaryKey(Integer cate_id);

    int updateByExampleSelective(@Param("record") YueduCategories record, @Param("example") YueduCategoriesExample example);

    int updateByExample(@Param("record") YueduCategories record, @Param("example") YueduCategoriesExample example);

    int updateByPrimaryKeySelective(YueduCategories record);

    int updateByPrimaryKey(YueduCategories record);
}