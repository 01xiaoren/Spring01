package com.xiaore;

import com.xiaore.config.SpringConfig;
import com.xiaore.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = applicationContext.getBean(BookDao.class);
        bean.save();
    }
}
