package com.gupaoedu.pattren.factory.abstractFactory.javaProduct;

import com.gupaoedu.pattren.factory.abstractFactory.INote;

public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
