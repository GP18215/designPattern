package com.gupaoedu.pattren.singleton.lazy;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 15:30
 * Description: 懒汉式 双重锁
 */
public class LazyDoubleCheckSingleton {
    //volatile禁止指令重排序？volatile修饰的话，可以保证这个初始化的有序性
    /**
     * 什么是指令重排序
     * 指在执行结果不会改变的情况下，JVM为了提高程序的执行效率会对指令进行重排序
     */
    private volatile static LazyDoubleCheckSingleton singleton ;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        //双重锁
        if(singleton == null){//保证对象为null的之后才会走synchronized
            synchronized (LazyDoubleCheckSingleton.class){//只加synchroized还是会影响效率
                if (singleton == null){
                    singleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                    //4.初次访问对象
                    //如果是3，4的顺序颠倒的话，再没有volatile的话可能导致程序的异常
                }
            }
        }

        return singleton;
    }
}
