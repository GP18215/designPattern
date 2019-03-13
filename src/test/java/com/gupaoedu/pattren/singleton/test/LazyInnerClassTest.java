package com.gupaoedu.pattren.singleton.test;

import com.gupaoedu.pattren.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 17:09
 * Description: 反射破坏单例
 */
public class LazyInnerClassTest {
    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            //获取私有构造器
            Constructor c = clazz.getDeclaredConstructor(null);

            //强制访问
            c.setAccessible(true);

            //创建对象
            Object o1 = c.newInstance();

            Object o2 = c.newInstance();

            System.out.println(o1);
            System.out.println(o2);

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
