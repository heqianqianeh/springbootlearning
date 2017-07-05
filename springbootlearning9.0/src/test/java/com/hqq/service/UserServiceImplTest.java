package com.hqq.service;

import com.hqq.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * UserServiceImplTest
 * Created by heqianqian on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() throws Exception {
        userService.createUser("rainy", 33);
    }

    @Test
    public void updateAgeByName() throws Exception {
        userService.updateAgeByName("rainy",100);
    }

    @Test
    public void getCount() throws Exception {
        int count = userService.getCount();
        System.out.println(count);
    }

    @Test
    public void deleteAll() throws Exception {
        userService.deleteAll();
    }
}