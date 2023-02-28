package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.dao.BookDao;
import com.xiaoren.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void test组件() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
        BookService bean = context.getBean(BookService.class);
        System.out.println(bean);
    }

    //纯注解
    @Test
    public void test纯注解() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bean = context.getBean(BookService.class);
        bean.save();
    }
}
