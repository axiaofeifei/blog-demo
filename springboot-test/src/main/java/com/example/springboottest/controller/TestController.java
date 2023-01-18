package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/17 15:59
 */
@RestController
@RequestMapping(value = "/test",method = RequestMethod.POST)
public class TestController {

    @GetMapping("/getValue")
    public String test(){
        return "test";
    }
}
