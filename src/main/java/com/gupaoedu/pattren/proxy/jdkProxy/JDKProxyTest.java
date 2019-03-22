package com.gupaoedu.pattren.proxy.jdkProxy;

import com.gupaoedu.pattren.proxy.Person;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/22
 * Time: 13:13
 * Description: No Description
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new JDKMeiPo().getInstance(new Customer());

        person.findLove();

        person.findJob();
    }
}
