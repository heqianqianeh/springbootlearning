package com.hqq;

import com.hqq.entity.User;
import com.hqq.entity.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * ApplicationTest
 * Created by heqianqian on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class ApplicationTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindById() throws Exception {
        User byId = userMapper.findById(1L);
        System.out.println(byId);
    }

    @Test
    public void testList() throws Exception {
        List<User> userList = userMapper.listUser();
        System.out.println(userList);
    }
}