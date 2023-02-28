package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.xiaoren.dao", "com.xiaoren.service"})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
