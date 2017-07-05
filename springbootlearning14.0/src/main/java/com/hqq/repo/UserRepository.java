package com.hqq.repo;

import com.hqq.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * UserRepository
 * Created by heqianqian on 2017/7/5.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findAgeByName(String name);

    //@Query("select count(*) from user")
    //int getCount();
}
