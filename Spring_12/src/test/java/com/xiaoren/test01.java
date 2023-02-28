package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test01 {
    @Test
    public void testGetBean() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bean = applicationContext.getBean(BookService.class);
        bean.service();
    }
}
