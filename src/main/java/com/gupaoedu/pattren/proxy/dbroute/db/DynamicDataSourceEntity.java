package com.gupaoedu.pattren.proxy.dbroute.db;

public class DynamicDataSourceEntity {

    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    private static final String DEFAULT_SOURCE = null;

    //构造方法私有化
    private DynamicDataSourceEntity(){}

    public static String get(){
       return local.get();
    }

    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }
    //假如数据源名称为DB_2019、DB_2018
    public static void  set(String dbSource){
        local.set(dbSource);
    }

    public static void set(int year){
        local.set("DB"+year);
    }
}
