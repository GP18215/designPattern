package com.gupaoedu.pattren.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 */
public class ContainerSingleton {
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className){
        if(!ioc.containsKey(className)){
            Object obj = null;
            try{
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            ioc.get(className);
        }
        return ioc.get(className);
    }
}
