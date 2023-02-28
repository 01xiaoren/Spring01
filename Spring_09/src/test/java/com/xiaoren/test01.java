package com.xiaoren;

import com.xiaoren.dao.BookDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class test01 {
    //获取ioc容器加载资源管理对象
    @Test
    public void testDataSource() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) context.getBean("dataSource2");
//        System.out.println(dataSource);
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
    }
}
