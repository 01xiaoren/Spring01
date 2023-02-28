package com.xiaoren.dao.impl;

import com.xiaoren.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    //集合注入
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void book() {
        System.out.println("book ...");
        System.out.println("遍历数据组:" + Arrays.toString(array));
        System.out.println("遍历list集合：" + list);
        System.out.println("遍历set集合：" + set);
        System.out.println("遍历map集合：" + map);
        System.out.println("遍历properties:" + properties);
    }
/**
 玩玩
 //protected default private public访问权限修饰符
 //方法定义
 private Object save(String name, int age){
 Object obj= null;
 System.out.println("这是一个save方法");//声明部分
 save("张三",21);//方法体传入参数
 return  obj;
 }

 */

}


