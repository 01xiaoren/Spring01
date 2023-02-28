package com.xiaoren.service.impl;

import com.xiaoren.dao.BookDao;
import com.xiaoren.dao.BookDao01;
import com.xiaoren.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private BookDao01 bookDao01;

    public void setBookDao01(BookDao01 bookDao01) {
        this.bookDao01 = bookDao01;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public void service() {
        System.out.println("service...");
        bookDao.dao();
        bookDao01.dao1();
    }
}
