package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("userDao......");
    }
    public void init(){
        System.out.println("bean初始化后");
    }
    public void destory(){
        System.out.println("bean销毁前");
    }
}
