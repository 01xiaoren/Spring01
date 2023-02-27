package com.xiaoren;

import com.xiaoren.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void testGetBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bean = applicationContext.getBean(BookService.class);
        bean.save();
        BookService bean1 = applicationContext.getBean(BookService.class);
        System.out.println(bean == bean1);
    }

}
