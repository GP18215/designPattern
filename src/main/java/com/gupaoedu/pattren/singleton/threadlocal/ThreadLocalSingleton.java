package com.gupaoedu.pattren.singleton.threadlocal;

/**
 *线程内安全,可以运用于动态数据源切换
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal =
                                  new ThreadLocal<ThreadLocalSingleton>(){
                                      @Override
                                      protected ThreadLocalSingleton initialValue() {
                                          return new ThreadLocalSingleton();
                                      }
                                  };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
