package com.example.springbootsatoken.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/19 9:01
 */
@RefreshScope
@RestController
@RequestMapping("/get")
public class HelloController {

    @GetMapping("/getValue")
    public String test(){
        System.out.println("test");
        return "test";
    }
}
