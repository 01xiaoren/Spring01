package com.xiaoren.service.impl;

import com.xiaoren.dao.BooDao;
import com.xiaoren.dao.UserDao;
import com.xiaoren.service.BookService;

public class BookDaoServiceImpl implements BookService {

    private BooDao booDao;
    private UserDao userDao;

    //构造器注入

    public BookDaoServiceImpl(BooDao booDao, UserDao userDao) {
        this.booDao = booDao;
        this.userDao = userDao;
    }

    public void service() {
        System.out.println("service....");
        booDao.dao();
        userDao.save();
    }
}
