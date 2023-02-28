package com.xiaore.dao.imp;

import com.xiaore.dao.BookDao;
import org.springframework.stereotype.Service;

@Service
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("save....");
        System.out.println(System.currentTimeMillis());
    }

    public void update() {
        System.out.println("update,...");
    }
}
