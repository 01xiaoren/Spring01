package com.xiaoren;

import com.xiaoren.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void testConstruction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bean = context.getBean(BookService.class);
        bean.service();
    }
}
