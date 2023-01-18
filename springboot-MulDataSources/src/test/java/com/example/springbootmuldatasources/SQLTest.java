package com.example.springbootmuldatasources;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/18 14:12
 */
@SpringBootTest
public class SQLTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test(){
        System.out.println(dataSource.getClass());
    }
}
