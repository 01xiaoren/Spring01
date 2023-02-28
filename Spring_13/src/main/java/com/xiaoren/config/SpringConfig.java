package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xiaoren")
@PropertySource("classpath:jdbc.properties")
@Import(JdbcConfig.class)//扫描外部配置资源
public class SpringConfig {

}
