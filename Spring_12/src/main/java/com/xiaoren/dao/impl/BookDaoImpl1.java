package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl1 implements BookDao {
    public void bookDao() {
        System.out.println("book dao save ...2");
    }
}
