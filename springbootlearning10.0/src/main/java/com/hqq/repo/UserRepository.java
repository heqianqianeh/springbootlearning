package com.hqq.repo;

import com.hqq.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserRepository
 * Created by heqianqian on 2017/7/4.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);

    User findByNameAndPwd(String name,String pwd);
}
