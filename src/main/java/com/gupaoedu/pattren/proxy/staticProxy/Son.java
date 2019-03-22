package com.gupaoedu.pattren.proxy.staticProxy;

import com.gupaoedu.pattren.proxy.Person;

/**
 * 被代理对象
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求:肤白貌美大长腿!");
    }

    @Override
    public void findJob() {

    }
}
