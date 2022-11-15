package com.hhf.exceltest2.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//设置user类的静态excel输出
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ExcelTarget("user")
public class User implements Serializable {
    @Excel(name = "编号", orderNum = "1", width = 10)
    private Integer id;
    @Excel(name = "姓名", orderNum = "2", width = 30)
    private String name;
    @Excel(name = "年龄", orderNum = "4", width = 10)
    private Integer age;
    @Excel(name = "性别", orderNum = "5", width = 10)
    private String gender;
    @Excel(name = "生日", orderNum = "3", width = 20.0,
            exportFormat = "yyyy年MM月dd日", importFormat = "yyyy年MM月dd日")
    private Date birthday;



    //自己准备的用户假数据
    public List<User> setUsersData() {

        List<User> users = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            User user = User.builder()
                    .id(i)
                    .name("user" + i)
                    .age(i * 10)
                    .gender(i % 2 == 0 ? "男" : "女")
                    .birthday(new Date())
                    .build();
            users.add(user);
        }
        return users;
    }

}

