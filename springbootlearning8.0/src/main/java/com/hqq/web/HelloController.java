package com.hqq.web;

import com.hqq.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * HelloController
 * Created by heqianqian on 2017/7/4.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("host", "http://www.baicu,com");
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("产生错误1");
    }

    @RequestMapping("/json")
    public String json() throws Exception {
        throw new MyException("产生错误2");
    }
}
