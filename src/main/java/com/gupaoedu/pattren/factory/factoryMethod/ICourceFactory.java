package com.gupaoedu.pattren.factory.factoryMethod;

import com.gupaoedu.pattren.factory.ICource;

/**
 * 工厂方法模式,创建对象的细节在子类中实现
 */
public interface ICourceFactory {
    ICource create();
}
