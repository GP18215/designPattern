package com.gupaoedu.pattren.singleton.hungry;

/**
 * 饿汉式单例
 * 他是在类加载的时候就立即初始化，并且创建单例对象
 * 优点：没有任何的锁，执行效率比较高
 * 缺点：类加载的时候就初始化，不管你用还是不用，我都占用着空间，浪费内存
 * 绝对的线程安全，在线程还没有出来的时候就已经实例化，不存在访问安全问题
 */
public class HungrySingleton {
    //先静态，后动态
    //先属性，后方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();


    //单例模式的首先要私有化构造方法，再提供一个全局访问控制点
    private HungrySingleton(){
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
