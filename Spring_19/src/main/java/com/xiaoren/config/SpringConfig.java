package com.xiaoren.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.xiaoren")
//@PropertySource：加载类路径jdbc.properties文件
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MapConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
