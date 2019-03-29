package com.gupaoedu.pattren.factory.abstractFactory.javaProduct;

import com.gupaoedu.pattren.factory.abstractFactory.CourceFactory;
import com.gupaoedu.pattren.factory.abstractFactory.INote;
import com.gupaoedu.pattren.factory.abstractFactory.IVideo;

public class JavaCourceFactory implements CourceFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();

    }
}
