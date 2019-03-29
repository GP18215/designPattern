package com.gupaoedu.pattren.proxy.dynamicProxy.mycProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/26
 * Time: 13:12
 * Description: No Description
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method , Object[] args) throws Throwable;
}
