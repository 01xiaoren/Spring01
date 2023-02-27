package com.xiaoren;

import com.xiaoren.dao.BookDao;
import com.xiaoren.dao.OrderDao;
import com.xiaoren.dao.UserDao;
import com.xiaoren.factory.OrderFactory;
import com.xiaoren.factory.UserDaoFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    //构造方法
    @Test
    public void testGetBean1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bean = applicationContext.getBean(BookDao.class);
        bean.book();
    }

    //静态工厂
    @Test
    public void testGetBean2() {
//        //静态工厂造对象
//        OrderDao orderDao = OrderFactory.getOrderDao().order();
        //spring形式写法
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");

        orderDao.order();
    }

    @Test
    public void testGetBean3() {
        /*//创建实例工厂
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        //通过实例工厂创建对象
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.user();*/
        //获取ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao bean = context.getBean(UserDao.class);
        bean.user();
    }
}
