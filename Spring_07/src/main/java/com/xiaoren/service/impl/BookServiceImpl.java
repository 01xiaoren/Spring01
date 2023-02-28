package com.xiaoren.service.impl;

import com.xiaoren.dao.BookDao;
import com.xiaoren.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    //自动装配 必须提供set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("save ....");
        bookDao.save();
    }
}
