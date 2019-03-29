package com.gupaoedu.pattren.factory.abstractFactory;

/**
 * 抽象工厂是用户的主入口
 */
public interface CourceFactory {
    INote createNote();
    IVideo createVideo();
}
