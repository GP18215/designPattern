package com.gupaoedu.pattren.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {

        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setAge(18);
        prototypeA.setName("Miao");
        List<String> hobbiesList = new ArrayList<>();
        hobbiesList.add("sing");
        prototypeA.setHobbies(hobbiesList);



        ConcretePrototypeA prototypeB = new ConcretePrototypeA();
        System.out.println(prototypeA.getAge());
        System.out.println(prototypeB.getAge());
        prototypeA.setAge(20);

        Client client = new Client(prototypeA);
        ConcretePrototypeA prototypeC =
                (ConcretePrototypeA) client.startClone(prototypeA);
        prototypeC.setAge(21);

        System.out.println("C"+prototypeC.getAge());
        System.out.println("A"+prototypeA.getAge());

        System.out.println("克隆对象中的引用地址值："+prototypeA.getHobbies());
        System.out.println("原对象中的引用地址值：" + prototypeC.getHobbies());
        System.out.println("对象地址相比："+
                           (prototypeA.getHobbies() == prototypeC.getHobbies()));



    }
}
