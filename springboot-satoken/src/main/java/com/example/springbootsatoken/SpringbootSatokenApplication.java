package com.example.springbootsatoken;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.springbootsatoken.mapper")
public class SpringbootSatokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSatokenApplication.class, args);
    }

}
