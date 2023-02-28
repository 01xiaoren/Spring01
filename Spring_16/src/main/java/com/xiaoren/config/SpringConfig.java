package com.xiaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.xiaoren")
@EnableAspectJAutoProxy//注解开发aop启动@Aspect
public class SpringConfig {
}
