package com.hqq;

import com.hqq.schedule.ScheduledTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * ApplicationTest
 * Created by heqianqian on 2017/7/5.
 */
@SpringApplicationConfiguration(Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTest {

    @Autowired
    private ScheduledTask scheduledTask;

    @Test
    public void test() throws Exception {
        scheduledTask.showCurrentTime();
    }
}