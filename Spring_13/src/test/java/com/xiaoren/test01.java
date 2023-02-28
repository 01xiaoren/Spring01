package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class test01 {
    @Test
    public void testGetMysql() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = applicationContext.getBean(DataSource.class);
        System.out.println(bean);
    }
}
