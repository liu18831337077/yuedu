package com.liu.yuedu.mapper;

import com.liu.yuedu.pojo.YueduArticles;
import com.liu.yuedu.pojo.YueduArticlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YueduArticlesMapper {
    int countByExample(YueduArticlesExample example);

    int deleteByExample(YueduArticlesExample example);

    int deleteByPrimaryKey(Integer art_id);

    int insert(YueduArticles record);

    int insertSelective(YueduArticles record);

    List<YueduArticles> selectByExampleWithBLOBs(YueduArticlesExample example);

    List<YueduArticles> selectByExample(YueduArticlesExample example);

    YueduArticles selectByPrimaryKey(Integer art_id);

    int updateByExampleSelective(@Param("record") YueduArticles record, @Param("example") YueduArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") YueduArticles record, @Param("example") YueduArticlesExample example);

    int updateByExample(@Param("record") YueduArticles record, @Param("example") YueduArticlesExample example);

    int updateByPrimaryKeySelective(YueduArticles record);

    int updateByPrimaryKeyWithBLOBs(YueduArticles record);

    int updateByPrimaryKey(YueduArticles record);
}