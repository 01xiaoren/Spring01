package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;

public class BooDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    //setter注入需要提供要注入对象的set方法
    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    //setter注入需要提供要注入对象的set方法
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void dao() {
        System.out.println("book dao save ..." + databaseName + "," + connectionNum);
    }
}
