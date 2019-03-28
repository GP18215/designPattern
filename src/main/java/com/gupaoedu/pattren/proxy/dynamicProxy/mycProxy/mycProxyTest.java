package com.gupaoedu.pattren.proxy.dynamicProxy.mycProxy;

import com.gupaoedu.pattren.proxy.Person;
import com.gupaoedu.pattren.proxy.jdkProxy.Customer;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/27
 * Time: 13:21
 * Description: No Description
 */
public class mycProxyTest {
    public static void main(String[] args) {
        try{
            Person obj = (Person) new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findJob();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
