package com.gupaoedu.pattren.factory.factoryMethod;

import com.gupaoedu.pattren.factory.ICource;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourceFactory courceFactory = new PythonCourseFactory();
        ICource cource = courceFactory.create();
        cource.record();
    }
}
