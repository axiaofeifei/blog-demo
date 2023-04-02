package com.example.springbootmuldatasources.service.impl;

import com.example.springbootmuldatasources.entity.Dog;
import com.example.springbootmuldatasources.mapper.DogMapper;
import com.example.springbootmuldatasources.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 17:20
 */
@Service
public class DogServiceImpl implements DogService {
    @Autowired
    private DogMapper dogMapper;

    @Override
    public Dog getByName(String name) {
        Dog dog = dogMapper.selectByName(name);

        return dog;
    }
}
