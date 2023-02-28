package com.xiaoren.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Controller;

@Controller//受Spring控制
@Aspect//当aop处理
public class MyAdvice {

    //定义切入点
    @Pointcut("execution(void com.xiaoren.dao.BookDao.update())")
    public void pt() {
    }

    //方法执行前执行
    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
