package com.xiaoren.service.impl;

import com.xiaoren.dao.ResourcesDao;
import com.xiaoren.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesDao resourcesDao;

    @Override
    public boolean openURL(String url, String password) {
        boolean b = resourcesDao.readResources(url, password);
        return b;
    }
}
