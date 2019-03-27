package com.gupaoedu.pattren.proxy.dynamicProxy.mycProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/27
 * Time: 13:22
 * Description: No Description
 */
public class GPMeipo implements  GPInvocationHandler {
    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();

        return mycProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target,args);
        after();
        return null;
    }

    private void after() {
    }
    private  void before(){

    }
}
