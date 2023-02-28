package com.xiaoren.service.impl;

import com.xiaoren.dao.BookDao;
import com.xiaoren.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    //@Autowired：注入引用类型，自动装配模式，默认按类型装配
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    public void service() {
        System.out.println("book service save ...");
        bookDao.bookDao();
    }
}