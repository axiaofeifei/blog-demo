package com.example.springbootmuldatasources.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/18 16:35
 */
//@Configuration
//public class mybatisConfig {
//
//    @Bean("dataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.master")
//    public SqlSessionFactory getSqlSessionFactory(@Qualifier("dataSource") DynamicDataSource dataSource) {
//        try {
//            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//            // 如果不写这里，会导致 mybatis 出现 invalid bound statement (not found) 的问题
//            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*Mapper.xml"));
//            bean.setDataSource(dataSource);
//            return bean.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
//}
