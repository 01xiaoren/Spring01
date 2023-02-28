package com.xiaore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.xiaore")
@EnableAspectJAutoProxy//注解aop启动@Aspect
public class SpringConfig {

}
