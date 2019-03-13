package com.gupaoedu.pattren.singleton.hungry;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 15:08
 * Description: 饿汉式静态代码块
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton singleton;
    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){
    }

    public static HungryStaticSingleton getInstance(){
        return singleton;
    }
}
