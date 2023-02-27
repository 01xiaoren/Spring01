package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;

public class BookDaoImpl implements BookDao {
    //构造方法不可传入参数
    private BookDaoImpl() {
        System.out.println("构造实例化bean");
    }

    public void book() {
        System.out.println("bookDao ....");
    }
}
