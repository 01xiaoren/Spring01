package com.xiaoren;

import com.xiaore.config.SpringConfig;
import com.xiaore.dao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class test {
    @Autowired
    private BookDao bookDao;

    @Test
    public void testAop() {
        bookDao.save();
    }

}
