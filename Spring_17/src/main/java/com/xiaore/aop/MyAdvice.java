package com.xiaore.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Controller;

@Controller//spring加载
@Aspect
public class MyAdvice {

    //切入点表达式：
//    @Pointcut("execution(void com.xiaoren.dao.BookDao.update())")
//    @Pointcut("execution(void com.xiaoren.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(* com.xiaoren.dao.impl.BookDaoImpl.update(*))")    //no
//    @Pointcut("execution(void com.*.*.*.update())")
//    @Pointcut("execution(* *..*(..))")
//    @Pointcut("execution(* *..*e(..))")
//    @Pointcut("execution(void com..*())")
//    @Pointcut("execution(* com.xiaoren.*.*Service.find*(..))")
    //执行com.xiaoren包下的任意包下的名称以Service结尾的类或接口中的save方法，参数任意，返回值任意
    @Pointcut("execution(* com.xiaore.*.*Dao.save(..))")
    public void pt() {
    }

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
