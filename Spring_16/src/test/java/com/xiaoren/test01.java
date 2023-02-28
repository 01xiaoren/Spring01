package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.dao.BookDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test01 {
    @Test
    public void testAop() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = applicationContext.getBean(BookDao.class);
        bean.update();
    }
}
