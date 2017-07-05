package com.hqq.s;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MessageRepository
 * Created by heqianqian on 2017/7/4.
 */
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
