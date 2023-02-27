package com.xiaoren;

import com.xiaoren.dao.BookDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void getBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();//设置关闭沟子
        BookDao bean = context.getBean(BookDao.class);
        bean.save();
//        context.close();//关闭容器比较暴力
    }
}
