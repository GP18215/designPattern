package com.gupaoedu.pattren.factory.factoryMethod;

import com.gupaoedu.pattren.factory.ICource;
import com.gupaoedu.pattren.factory.PythonCource;

public class PythonCourseFactory implements ICourceFactory {
    @Override
    public ICource create() {
        return new PythonCource();
    }
}
