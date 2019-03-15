package com.gupaoedu.pattren.singleton.test;

/**
 *
 */
public class Pojo {

    private String name;
    private String age;

    public Pojo(){
        System.out.println("pojo构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
