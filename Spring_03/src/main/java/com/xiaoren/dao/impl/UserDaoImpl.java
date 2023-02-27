package com.xiaoren.dao.impl;

import com.xiaoren.dao.UserDao;

//实例工厂非静态
public class UserDaoImpl implements UserDao {
    public void user() {
        System.out.println("user do ....");
    }
}
