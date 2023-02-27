package com.xiaoren.factory;

import com.xiaoren.dao.UserDao;
import com.xiaoren.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

//代替原始工厂创建对象的方法
public class UserFactoryBean implements FactoryBean<UserDao> {
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }

    //判断是否单例非单例false非单例；true单例
    public boolean isSingleton() {
        return false;
    }
}
