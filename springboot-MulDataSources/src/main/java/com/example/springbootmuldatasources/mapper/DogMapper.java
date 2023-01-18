package com.example.springbootmuldatasources.mapper;

import com.example.springbootmuldatasources.entity.Dog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 17:02
 */
@Mapper
public interface DogMapper {
    Dog selectByName(String name);

}
