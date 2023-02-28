package com.xiaoren.service.impl;

import com.xiaoren.dao.BookDao;
import com.xiaoren.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//组件
//@Component定义bean
//@Component
//@Service：@Component衍生注解
@Service
public class BookServiceImpl implements BookService {
    @Autowired//自动装配
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("service.....");
        bookDao.dao();
    }
}
