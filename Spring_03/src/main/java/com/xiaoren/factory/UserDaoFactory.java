package com.xiaoren.factory;

import com.xiaoren.dao.UserDao;
import com.xiaoren.dao.impl.UserDaoImpl;

//实力工厂非静态
public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
