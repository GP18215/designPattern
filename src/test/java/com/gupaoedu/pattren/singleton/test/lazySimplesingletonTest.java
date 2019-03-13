package com.gupaoedu.pattren.singleton.test;

import com.gupaoedu.pattren.singleton.lazy.lazySimpleSingleton;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 15:18
 * Description: No Description
 */
public class lazySimplesingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        Thread t3 = new Thread(new ExectorThread());
        Thread t4 = new Thread(new ExectorThread());
        Thread t5 = new Thread(new ExectorThread());
        Thread t6 = new Thread(new ExectorThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
