package com.hqq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserServiceImpl
 * Created by heqianqian on 2017/7/4.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(String name, Integer age) {
        jdbcTemplate.update("Insert into user(name,age) values(?,?)", name, age);
    }

    @Override
    public void updateAgeByName(String name, Integer age) {
        jdbcTemplate.update("update user set age = ? where name = ?",age,name);
    }

    @Override
    public void deleteAll() {
        jdbcTemplate.execute("delete from user");
    }

    @Override
    public int getCount() {
        return jdbcTemplate.queryForObject("select count(*) from user",Integer.class);
    }
}
