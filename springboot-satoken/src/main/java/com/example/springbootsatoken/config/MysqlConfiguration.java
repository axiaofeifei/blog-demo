package com.example.springbootsatoken.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/19 9:47
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.yolo.springbootsatoken.mapper"}, sqlSessionFactoryRef = "domeSqlSessionFactory")
public class MysqlConfiguration {

    @Bean(name = "domeDataSource")
    @Primary
    public DataSource domeDataSource() throws Exception {
        String mysqlHost = "127.0.0.1";
        String mysqlPort = "3306";
        String mysqlUsername = "root";
        String mysqlPassword = "mysql";
        String mysqlDB = "blog-demo";
        String mysqlconfig = "?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&allowMultiQueries=true&serverTimezone=Asia/Shanghai";


        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://" + mysqlHost + ":" + mysqlPort + "/" + mysqlDB+mysqlconfig);
        dataSource.setPassword(mysqlPassword);
        dataSource.setUsername(mysqlUsername);
        dataSource.setMaxActive(100);
        dataSource.setMaxWait(60000);
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setMinEvictableIdleTimeMillis(300000);
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        dataSource.setInitialSize(5);
        dataSource.setMinIdle(1);
        return dataSource;
    }


    @Bean(name = "domeTransactionManager")
    @Primary
    public DataSourceTransactionManager domeTransactionManager() throws Exception {
        return new DataSourceTransactionManager(domeDataSource());
    }

    @Bean(name = "domeSqlSessionFactory")
    @Primary
    public SqlSessionFactoryBean sqlSessionFactory(@Qualifier("domeDataSource") DataSource dataSource, PageHelper pageHelper) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPlugins(new Interceptor[]{pageHelper});
        return sessionFactory;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        p.setProperty("dialect", "mysql");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}

