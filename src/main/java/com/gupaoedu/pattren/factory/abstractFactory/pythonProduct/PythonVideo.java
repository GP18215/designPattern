package com.gupaoedu.pattren.factory.abstractFactory.pythonProduct;

import com.gupaoedu.pattren.factory.abstractFactory.IVideo;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
