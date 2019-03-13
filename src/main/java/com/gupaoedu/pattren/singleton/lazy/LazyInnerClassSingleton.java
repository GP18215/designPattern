package com.gupaoedu.pattren.singleton.lazy;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 16:13
 * Description:懒汉式  内部类的方式实现
 * 这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 * 完美地屏蔽了这两个缺点
 */
public class LazyInnerClassSingleton {
    //防止反射攻击
    private LazyInnerClassSingleton(){
        if(LazyHolder.SINGLETON != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.SINGLETON;
    }

    //默认不加载
    private static class LazyHolder{
        //被调用时初始化，且只创建一次
        private static final LazyInnerClassSingleton SINGLETON = new LazyInnerClassSingleton();
    }
}
