package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
//@Scope设置单例非单例

public class BookDaoImpl implements BookDao {
    public void dao() {
        System.out.println("dao....");
    }

    //生命周期配置
    //构造方法后执行
    @PostConstruct
    public void init() {
        System.out.println("init.........");
    }

    //销毁前
    @PreDestroy
    public void destory() {
        System.out.println("desctory....");
    }
}
