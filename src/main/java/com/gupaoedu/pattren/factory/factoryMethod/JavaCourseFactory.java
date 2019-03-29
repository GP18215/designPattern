package com.gupaoedu.pattren.factory.factoryMethod;

import com.gupaoedu.pattren.factory.ICource;
import com.gupaoedu.pattren.factory.JavaCource;

public class JavaCourseFactory implements ICourceFactory {
    @Override
    public ICource create() {
        return new JavaCource();
    }
}
