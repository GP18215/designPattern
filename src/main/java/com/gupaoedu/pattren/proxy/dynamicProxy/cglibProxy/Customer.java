package com.gupaoedu.pattren.proxy.dynamicProxy.cglibProxy;

import com.gupaoedu.pattren.proxy.Person;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/22
 * Time: 13:11
 * Description: No Description
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("单身客户要求：阳光帅气有内涵");
    }

    @Override
    public void findJob() {
        System.out.println("求职者要求：BAT互联网");
    }
}
