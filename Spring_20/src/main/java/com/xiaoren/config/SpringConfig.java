package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.xiaoren")
@EnableAspectJAutoProxy
public class SpringConfig {
}
