package com.lkm.springinaction5my.controller;

import com.lkm.springinaction5my.tacos.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @ClassName
 * @Description TODO
 * @Author likunming
 * @Date 2022/5/31 20:39
 **/
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    public String orderForm(Model model){
        model.addAttribute("order",new Order());
        return "orderForm";
    }

}
