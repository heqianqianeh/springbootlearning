package com.hqq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * ApplicationTest
 * Created by heqianqian on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate primaryTemplate;


    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate secondaryTemplate;


    @Test
    public void test() throws Exception {
        primaryTemplate.execute("Insert into user(name,age) values('heqianiqan1',123)");
        secondaryTemplate.execute("Insert into user(name,age) values('heqianiqan2',123)");
    }
}