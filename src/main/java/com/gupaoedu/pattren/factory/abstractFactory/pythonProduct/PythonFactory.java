package com.gupaoedu.pattren.factory.abstractFactory.pythonProduct;

import com.gupaoedu.pattren.factory.abstractFactory.CourceFactory;
import com.gupaoedu.pattren.factory.abstractFactory.INote;
import com.gupaoedu.pattren.factory.abstractFactory.IVideo;

public class PythonFactory implements CourceFactory {
    @Override
    public INote createNote() {
        return null;
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
