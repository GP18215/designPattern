package com.gupaoedu.pattren.factory.abstractFactory.javaProduct;

import com.gupaoedu.pattren.factory.abstractFactory.IVideo;

public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
