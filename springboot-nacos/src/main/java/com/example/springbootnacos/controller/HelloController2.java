package com.example.springbootnacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/17 16:34
 */

@RestController
@RefreshScope
@RequestMapping(value = "/demo",method = RequestMethod.GET)
public class HelloController2 {


    @Value("${name}")
    private String name;


    @Value("${name2}")
    private String name2;

    @GetMapping("/getValue")
    public String getValue() {
        System.out.println("helloController_2");
        System.out.println(name);
        return "[name: " + name + "name2 : "+name2+"]";
    }
}