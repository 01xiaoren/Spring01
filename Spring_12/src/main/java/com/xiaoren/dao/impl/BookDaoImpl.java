package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    //    @Value("张三")
    @Value("${name}")
    private String name;
    //@Value：注入简单类型（无需提供set方法）

    public void bookDao() {
        System.out.println("book dao save ..." + name);
    }
}
