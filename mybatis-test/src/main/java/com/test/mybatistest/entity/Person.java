package com.test.mybatistest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/15 8:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    private Integer userId;

    private String userName;

    private Integer age;

    private Integer Salary;

    private String gender;
}
