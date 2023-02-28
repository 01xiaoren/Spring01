package com.xiaoren.dao.impl;

import com.xiaoren.dao.BooDao;

public class BookDaoImpl implements BooDao {
    private String name;
    private int age;

    //构造器注入
    public BookDaoImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dao() {
        System.out.println("dao。。。。");
        System.out.println("name " + name + "age " + age);
    }
}
