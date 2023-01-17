package com.example.springbootnacos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/17 14:30
 */
@SpringBootTest(classes = TestSQL.class)
public class TestSQL {
    @Autowired(required = false)
    private DataSource dataSource;


    //@Test
    //void getConnetion() throws SQLException {
    //    System.out.println(dataSource.getConnection());
    //}
}
