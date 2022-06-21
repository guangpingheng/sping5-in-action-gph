package com.lkm.springinaction5my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/31 14:44
 **/

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping
    public String home(){
        return "home";
    }
}
