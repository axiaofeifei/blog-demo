package com.example.springbootsatoken.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/19 14:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SatokenUser {
    private Integer id;
    private String username;
    private String realName;
    private String salt;
    private String password;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
    private Removed removed;

}
