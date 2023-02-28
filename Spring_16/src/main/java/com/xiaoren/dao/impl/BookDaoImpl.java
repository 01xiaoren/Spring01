package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("save...");
    }

    public void update() {
        System.out.println("update。。。。。。");
    }

}
