package com.mybatiestext.dao;

import com.mybatiestext.entity.User;
import com.mybatiestext.entity.UserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTMapper {
    int countByExample(UserTExample example);

    int deleteByExample(UserTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserTExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserTExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserTExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}