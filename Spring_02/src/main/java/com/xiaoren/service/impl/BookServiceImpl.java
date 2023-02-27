package com.xiaoren.service.impl;

import com.xiaoren.dao.BookDao;
import com.xiaoren.dao.impl.BookDaoImpl;
import com.xiaoren.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {
/*    //业务层new 对象创建方式
    private BookDao bookDao = new BookDaoImpl();*/

    @Autowired
    private BookDao bookDao;

    public void save() {
        System.out.println("service...");
        bookDao.save();
    }

    //提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
