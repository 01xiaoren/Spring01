package com.xiaoren.factory;

import com.xiaoren.dao.OrderDao;
import com.xiaoren.dao.impl.OrderDaoImpl;

public class OrderFactory {
    //静态工厂方法
    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }
}
