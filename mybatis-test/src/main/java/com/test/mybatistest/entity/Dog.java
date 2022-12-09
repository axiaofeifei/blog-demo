package com.test.mybatistest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * @Author hehongfei
 * @Description
 * @Date 2022/12/9 16:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    private String name;
    private Integer age;
    private Gender gender;
}
