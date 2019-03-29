package com.gupaoedu.pattren.factory.simpleFactory;

import com.gupaoedu.pattren.factory.ICource;
import com.gupaoedu.pattren.factory.JavaCource;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
//        ICource cource = factory.create("java");
//        cource.record();
//        ICource pCource = factory.create("python");
//        pCource.record();

//        ICource cource =  factory.create("PythonCource");

        ICource cource = factory.create(JavaCource.class);
        cource.record();
    }
}
