package com.hqq.service;

/**
 * UserService
 * Created by heqianqian on 2017/7/4.
 */
public interface UserService {

    void createUser(String name,Integer age);

    void updateAgeByName(String name,Integer age);

    void deleteAll();

    int getCount();
}
