package com.xiaoren;

import com.xiaoren.dao.BookDao;
import com.xiaoren.dao.impl.BookDaoImpl;

public class test01 {
    //自己创建对象方法
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        bookDao.save();
    }
}
