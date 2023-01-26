package com.example.springbootmuldatasources.controller;

import com.example.springbootmuldatasources.entity.Dog;
import com.example.springbootmuldatasources.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/26 13:47
 */
@RestController
@RequestMapping("/mysql")
public class MysqlController {
    @Autowired
    private DogService dogService;

    @GetMapping("/getDogName")
    public void getOne(){
        Dog dog = dogService.getByName("小花");
        System.out.println(dog);
    }
}
