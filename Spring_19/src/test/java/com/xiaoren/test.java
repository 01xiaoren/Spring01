package com.xiaoren;

import com.xiaoren.config.SpringConfig;
import com.xiaoren.domain.Account;
import com.xiaoren.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = SpringConfig.class)
public class test {
    @Autowired
    private AccountService accountService;

    @Test
    public void testGetById() {
        Account byId = accountService.findById(2);
        System.out.println(byId);
    }

    //查询全部
    @Test
    public void testGetAll() {
        System.out.println(accountService.findAll());
    }
}

