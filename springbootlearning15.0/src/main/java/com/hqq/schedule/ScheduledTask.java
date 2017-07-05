package com.hqq.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ScheduledTask
 * Created by heqianqian on 2017/7/5.
 */
@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 2000)
    public void showCurrentTime(){
        System.out.println("当前时间:"+dateFormat.format(new Date()));
    }

}
