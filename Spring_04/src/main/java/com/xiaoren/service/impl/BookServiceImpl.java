package com.xiaoren.service.impl;

import com.xiaoren.dao.BookDao;
import com.xiaoren.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import java.awt.print.Book;

//接口方式定义生命周期
public class BookServiceImpl implements BookService, InitializingBean, Destroyable {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void book() {
        System.out.println("bookservice....");
        bookDao.save();
    }

    public void destroy() throws DestroyFailedException {
        System.out.println("destory/.......");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("init...../");
    }
}
