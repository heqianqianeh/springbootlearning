package com.hqq.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController
 * Created by heqianqian on 2017/7/4.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name","velocity");
        return "index";
    }
}
