package com.hqq.repo;

import com.hqq.Application;
import com.hqq.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;

import java.util.List;

import static org.junit.Assert.*;

/**
 * UserRepositoryTest
 * Created by heqianqian on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    @Transactional
    public void test() throws Exception {
        repository.save(new User("heqianqian","123"));
        repository.save(new User("lucy","3453"));
        repository.save(new User("jack","1423423"));
        repository.save(new User("rose","1232423"));

        List<User> userList = repository.findAll();
        assertEquals(4,userList.size());

        User heqianqian = repository.findByName("heqianqian");
        assertEquals("123",heqianqian.getPwd());

        User heqianqian1 = repository.findByNameAndPwd("heqianqian", "123");
        System.out.println(heqianqian1);

    }
}