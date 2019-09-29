package com.example.spring.dictionary.dao;

import com.example.spring.dictionary.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from TUser where userid = #{userid}")
    User getUserInfo(@Param("userid") Number userid);
}
