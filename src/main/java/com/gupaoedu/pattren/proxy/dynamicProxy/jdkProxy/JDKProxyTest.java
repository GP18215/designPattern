package com.gupaoedu.pattren.proxy.dynamicProxy.jdkProxy;

import com.gupaoedu.pattren.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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

       byte[] bytes =  ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        try {
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
