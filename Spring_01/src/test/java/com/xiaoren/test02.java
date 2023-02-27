package com.xiaoren;


import com.xiaoren.dao.BookDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test02 {
    @Test
    public void testGetBean() {
        //获取ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();
    }
}
