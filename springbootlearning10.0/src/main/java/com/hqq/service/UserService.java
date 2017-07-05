package com.hqq.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserService
 * Created by heqianqian on 2017/7/5.
 */
@Service
public interface UserService {

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    boolean login(String name,String pwd);

}
