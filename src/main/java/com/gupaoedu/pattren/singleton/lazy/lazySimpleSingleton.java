package com.gupaoedu.pattren.singleton.lazy;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 15:12
 * Description: 懒汉式单例
 */
public class lazySimpleSingleton {
    private static lazySimpleSingleton lazy;

    private lazySimpleSingleton(){}

    //涉及到线程安全问题,加synchronized关键字,但直接加入到方法上会影响效率
    public synchronized static lazySimpleSingleton getInstance(){

        if(lazy == null){
            lazy = new lazySimpleSingleton();
        }

        return  lazy;
    }
}
