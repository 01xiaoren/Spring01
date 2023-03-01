package com.xiaoren.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {
    //    @Pointcut("execution(boolean com.xiaoren.service.*Service.*(..))")
    @Pointcut("execution(boolean com.xiaoren.service.*Service.*(*,*))")

    private void servicePt() {
    }

    @Around("com.xiaoren.aop.DataAdvice.servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            //判断参数是不是字符串
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();//去掉空格
            }

        }
        Object ret = pjp.proceed(args);
        return ret;
    }
}
