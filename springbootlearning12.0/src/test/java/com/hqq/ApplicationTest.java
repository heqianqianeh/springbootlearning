package com.hqq;

import com.hqq.p.User;
import com.hqq.p.UserRepository;
import com.hqq.s.Message;
import com.hqq.s.MessageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * ApplicationTest
 * Created by heqianqian on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;


    @Test
    public void test() throws Exception {
        userRepository.save(new User("heqianqian","123"));
        messageRepository.save(new Message("heqianqian","content"));
    }
}