package com.gupaoedu.pattren.singleton.test;

import com.gupaoedu.pattren.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class reflectEnum {
    public static void main(String[] args) {
        try{
            Class<?> clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            //jdk底层中就不允许反射创建单例
            EnumSingleton enumSingleton = (EnumSingleton) c.newInstance("myc",777);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
