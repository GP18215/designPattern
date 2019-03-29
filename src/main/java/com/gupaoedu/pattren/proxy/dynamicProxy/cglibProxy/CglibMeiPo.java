package com.gupaoedu.pattren.proxy.dynamicProxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/29
 * Time: 12:57
 * Description: cglib动态代理
 */
public class CglibMeiPo implements MethodInterceptor {



    public Object getInstance(Class<?> clazz)throws Exception{
        //创建代理对象
        Enhancer enhancer = new Enhancer();
        //设置代理的对象类为参数传来被代理的对象
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);
        return enhancer.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object obj = methodProxy.invokeSuper(o,objects);
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
