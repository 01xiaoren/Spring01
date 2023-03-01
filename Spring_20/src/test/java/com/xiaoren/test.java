package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = applicationContext.getBean(BookDao.class);
        String winou = bean.findName(100, "winou");
        System.out.println(winou);
    }
}
