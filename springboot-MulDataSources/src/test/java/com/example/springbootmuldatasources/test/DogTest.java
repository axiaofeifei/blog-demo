package com.example.springbootmuldatasources.test;

import com.example.springbootmuldatasources.entity.Dog;
import com.example.springbootmuldatasources.mapper.DogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 17:10
 */
@SpringBootTest
public class DogTest {
    @Autowired
    private DogMapper dogMapper;

    @Test
    void test(){
        Dog dog = dogMapper.selectByName("小花");
        System.out.println("dog = " + dog);
    }
}
