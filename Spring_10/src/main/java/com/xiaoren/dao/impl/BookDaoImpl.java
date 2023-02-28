package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;
import org.springframework.stereotype.Repository;

//加载组件
//@Component定义bean
//@Component("bookDao")
//@Repository：@Component衍生注解
@Repository("bookDaO")
public class BookDaoImpl implements BookDao {
    public void dao() {
        System.out.println("dao....");
    }
}
