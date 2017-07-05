package com.hqq.entity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * UserMapper
 * Created by heqianqian on 2017/7/4.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE id = #{id}")
    User findById(@Param("id") Long id);

    @Select("SELECT * FROM USER")
    List<User> listUser();

}
