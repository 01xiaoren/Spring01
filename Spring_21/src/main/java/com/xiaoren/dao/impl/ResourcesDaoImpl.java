package com.xiaoren.dao.impl;

import com.xiaoren.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {

        //打印密码长度
        System.out.println(password.length());

        //模拟校验
        return password.equals("root");
    }
}
