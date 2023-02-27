package com.xiaoren.dao.impl;

import com.xiaoren.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    public OrderDao order() {
        System.out.println("静态工厂实例化bean");
        return null;
    }
}
