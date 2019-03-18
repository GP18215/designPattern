package com.gupaoedu.pattren.prototype.simple;

import java.util.List;

public class ConcretePrototypeA implements Prototype {
    private String name;
    private int age;
    private List hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    //浅克隆,克隆之后被克隆对象和克隆对象中值得地址相同,复制的不是值而是地址的引用
    public Prototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();

        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);



        return concretePrototype;
    }
}
