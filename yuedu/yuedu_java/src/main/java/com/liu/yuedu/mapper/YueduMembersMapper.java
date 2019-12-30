package com.liu.yuedu.mapper;
import com.liu.yuedu.pojo.YueduMembers;
import com.liu.yuedu.pojo.YueduMembersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface YueduMembersMapper {
    int countByExample(YueduMembersExample example);

    int deleteByExample(YueduMembersExample example);

    int deleteByPrimaryKey(Integer u_id);

    int insert(YueduMembers record);

    int insertSelective(YueduMembers record);

    List<YueduMembers> selectByExample(YueduMembersExample example);

    YueduMembers selectByPrimaryKey(Integer u_id);

    int updateByExampleSelective(@Param("record") YueduMembers record, @Param("example") YueduMembersExample example);

    int updateByExample(@Param("record") YueduMembers record, @Param("example") YueduMembersExample example);

    int updateByPrimaryKeySelective(YueduMembers record);

    int updateByPrimaryKey(YueduMembers record);
}