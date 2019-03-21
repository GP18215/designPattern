package com.gupaoedu.pattren.proxy.staticProxy;

/**
 * 静态代理
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);
        father.findLove();
    }
}
