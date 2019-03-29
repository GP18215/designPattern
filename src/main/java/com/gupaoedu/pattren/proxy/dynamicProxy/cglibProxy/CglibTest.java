package com.gupaoedu.pattren.proxy.dynamicProxy.cglibProxy;

import com.gupaoedu.pattren.proxy.Person;

import java.rmi.server.ExportException;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/29
 * Time: 13:05
 * Description: No Description
 */
public class CglibTest {
    public static void main(String[] args) {
        try{
            Person person = (Person) new CglibMeiPo().getInstance(new Customer().getClass());
            person.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
