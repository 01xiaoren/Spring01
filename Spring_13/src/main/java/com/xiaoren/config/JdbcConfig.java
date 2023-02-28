package com.xiaoren.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.xiaoren.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    //1.定义一个方法获得要管理的对象
    @Value("${jdbc_driver}")
    private String driver;
    @Value("{jdbc_url}")
    private String url;
    @Value("${jdbc_username}")
    private String username;
    @Value("${jdbc_password}")
    private String password;


    //2.添加@Bean，表示当前方法的返回值是一个bean
    //@Bean修饰的方法，形参根据类型自动装配
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
