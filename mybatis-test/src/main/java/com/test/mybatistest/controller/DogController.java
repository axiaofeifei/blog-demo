package com.test.mybatistest.controller;

import com.test.mybatistest.entity.Dog;
import com.test.mybatistest.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 17:23
 */
@RequestMapping("/dog")
@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/get")
    public void test(){
        Dog dog = dogService.getByName("小花");
        System.out.println("dog = " + dog);

    }
}
