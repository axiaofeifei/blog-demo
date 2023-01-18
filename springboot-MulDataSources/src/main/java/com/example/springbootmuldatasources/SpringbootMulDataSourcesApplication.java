package com.example.springbootmuldatasources;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
public class SpringbootMulDataSourcesApplication {
    static {
        System.setProperty("archaius.configurationSource.defaultFileName", "test.properties");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMulDataSourcesApplication.class, args);
    }

}
