package com.hqq.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Task
 * Created by heqianqian on 2017/7/5.
 */
@Component
public class Task {


    @Async
    public Future<String> doTaskOne() throws InterruptedException {
        Random random = new Random();
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("任务一用时:" + (end - start));
        return new AsyncResult<String>("任务一完成");
    }

    @Async
    public Future<String> doTaskTwo() throws InterruptedException {
        Random random = new Random();
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("任务二用时:" + (end - start));
        return new AsyncResult<String>("任务二完成");
    }

    @Async
    public Future<String> doTaskThree() throws InterruptedException {
        Random random = new Random();
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("任务三用时:" + (end - start));
        return new AsyncResult<String>("任务三完成");
    }

}
