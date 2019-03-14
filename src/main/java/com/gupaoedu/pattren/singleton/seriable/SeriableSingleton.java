package com.gupaoedu.pattren.singleton.seriable;

import java.io.Serializable;

//反序列化是导致单例破坏
public class SeriableSingleton implements Serializable {
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new

    private static final SeriableSingleton singleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return singleton;
    }

    //防止反序列化破坏单例
    //在读取对象的时候会先判断当前对象是否有构造方法,如果有的话,则直接new出一个新对象,再判断
    //当前对象是否有readResolve方法,如果有的话通过反射调用此方法,并接受其返回的对象,刚刚new出来的对象则
    //则会被GC回收,从而保证单例不被破坏
    private Object readResolve(){
        return singleton;
    }


}
