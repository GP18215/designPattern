package com.gupaoedu.pattren.proxy.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/22
 * Time: 13:01
 * Description: jdk动态代理
 * 1)实现IncocationHandler接口
 * 2）重写invoke方法
 * 3）通过反射获得Proxy
 */
public class JDKMeiPo implements InvocationHandler {
    private Object target;

    public Object getInstance(Object target){
        this.target = target;

        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    public void before(){
        System.out.println("我是媒婆我要给你找对象,method.invoke方法执行前");
    }

    public void after(){
        System.out.println("method.invoke方法执行后");
    }
}
