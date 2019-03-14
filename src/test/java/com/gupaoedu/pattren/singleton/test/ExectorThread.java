package com.gupaoedu.pattren.singleton.test;

import com.gupaoedu.pattren.singleton.lazy.LazyDoubleCheckSingleton;
import com.gupaoedu.pattren.singleton.lazy.LazyInnerClassSingleton;
import com.gupaoedu.pattren.singleton.lazy.lazySimpleSingleton;
import com.gupaoedu.pattren.singleton.register.ContainerSingleton;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 15:21
 * Description: No Description
 */
public class ExectorThread implements Runnable{

    @Override
    public void run() {
//        lazySimpleSingleton singleton = lazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton doubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        LazyInnerClassSingleton innerClassSingleton = LazyInnerClassSingleton.getInstance();
          Pojo pojo  = (Pojo) ContainerSingleton.getBean("com.gupaoedu.pattren.singleton.test.Pojo");
        System.out.println(Thread.currentThread().getName() + ":" + pojo);
//        System.out.println(Thread.currentThread().getName() + ":" + doubleCheckSingleton);
//        System.out.println(Thread.currentThread().getName() + ":" + innerClassSingleton);
    }
}
