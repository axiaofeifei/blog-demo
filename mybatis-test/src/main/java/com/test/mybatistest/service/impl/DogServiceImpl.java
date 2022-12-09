package com.test.mybatistest.service.impl;

import com.test.mybatistest.entity.Dog;
import com.test.mybatistest.mapper.DogMapper;
import com.test.mybatistest.service.DogService;
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
