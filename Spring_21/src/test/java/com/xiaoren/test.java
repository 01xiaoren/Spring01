package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.service.ResourcesService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService bean = applicationContext.getBean(ResourcesService.class);
        boolean root = bean.openURL("https://www.xiaoren.com", "root  ");
        System.out.println(root);
    }
}
