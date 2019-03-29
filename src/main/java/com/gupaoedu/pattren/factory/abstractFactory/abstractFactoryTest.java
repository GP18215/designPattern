package com.gupaoedu.pattren.factory.abstractFactory;

import com.gupaoedu.pattren.factory.abstractFactory.javaProduct.JavaCourceFactory;

public class abstractFactoryTest {
    public static void main(String[] args) {
        CourceFactory cf = new JavaCourceFactory();
        INote note = cf.createNote();
        IVideo video = cf.createVideo();
        note.edit();
        video.record();
    }
}
