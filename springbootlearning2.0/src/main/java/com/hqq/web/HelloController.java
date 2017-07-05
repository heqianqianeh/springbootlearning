package com.hqq.web;

import com.hqq.prop.PersonProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * HelloController
 * Created by heqianqian on 2017/7/3.
 */
@RestController
public class HelloController {

    @Resource
    private PersonProperty personProperty;

    @RequestMapping("/hello")
    public PersonProperty hello(){
        return personProperty;
    }

}
