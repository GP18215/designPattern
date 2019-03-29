package com.gupaoedu.pattren.factory.abstractFactory.pythonProduct;

import com.gupaoedu.pattren.factory.abstractFactory.INote;

public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
