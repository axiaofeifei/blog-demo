package com.hhf.exceltest2.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//user类的动态表头输出
@Data
public class UserDynamicExcel implements Serializable {

    private static final long serialVersionUID = 8991244829305414889L;

    //表头名字
    private String filedShowName;

    //表头key值和查询出来的数据的实体相对应，即实体类的字段
    private String filedCode;

    //表头顺序
    private Integer orderNum;

    //字段数据类型
    private Integer dataType;


    public List<UserDynamicExcel> getUserExcelList_1(){
        ArrayList<UserDynamicExcel> userExcelList = new ArrayList<UserDynamicExcel>();
        //添加第一个姓名属性
        UserDynamicExcel userDynamicExcel_1 = new UserDynamicExcel();

        userDynamicExcel_1.setFiledShowName("姓名");
        userDynamicExcel_1.setFiledCode("name");
        userDynamicExcel_1.setOrderNum(1);
        userDynamicExcel_1.setDataType(0);

        //添加第三个生日属性
        UserDynamicExcel userDynamicExcel_3 = new UserDynamicExcel();

        userDynamicExcel_3.setFiledShowName("生日");
        userDynamicExcel_3.setFiledCode("birthday");
        userDynamicExcel_3.setOrderNum(2);
        userDynamicExcel_3.setDataType(0);

        userExcelList.add(userDynamicExcel_1);
        userExcelList.add(userDynamicExcel_3);


        return userExcelList;
    }

}
