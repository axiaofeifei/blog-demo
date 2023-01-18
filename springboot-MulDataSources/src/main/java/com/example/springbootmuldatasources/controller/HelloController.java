package com.example.springbootmuldatasources.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/18 13:00
 */
@RestController
@RefreshScope
@RequestMapping(value = "/test",method = RequestMethod.GET)
public class HelloController {

    @GetMapping("/getValue")
    public String getValue() {
        System.out.println("helloController_1");
        return "test";
    }

}