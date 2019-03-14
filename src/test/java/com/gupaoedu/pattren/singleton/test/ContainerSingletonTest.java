package com.gupaoedu.pattren.singleton.test;

import com.gupaoedu.pattren.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        Pojo p1 = (Pojo) ContainerSingleton.getBean("com.gupaoedu.pattren.singleton.test.Pojo");
        Pojo p2 = (Pojo) ContainerSingleton.getBean("com.gupaoedu.pattren.singleton.test.Pojo");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1==p2);

    }
}
