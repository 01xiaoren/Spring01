package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.domain.Account;
import com.xiaoren.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * spring整合mybatis链接数据库
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

//        Account ac = accountService.findById(1);
        List<Account> ac = accountService.findAll();
        ac.forEach(System.out::println);
        for (Account aout : ac) {
            System.out.println(aout);
        }
//        System.out.println(ac);
    }
}
