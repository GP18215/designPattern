package com.gupaoedu.pattren.singleton.register;

/**
 * 枚举式单例
 * 枚举再编译后也是类,并在static块中就已经初始化对象（饿汉式单例）
 *
 * 并且再反序列化的时候是通过类名和Class对象来寻找唯一的对象
 * Enum<?> en = Enum.valueOf((Class)cl, name);
 *
 * 反射也无法破坏单例,在反射底层newInstance()方法中已经确定了Enum类型不能被创建
 *  if ((clazz.getModifiers() & Modifier.ENUM) != 0)
 *
 */
public enum EnumSingleton {

        INSTANCE;

        private Object data;

        public Object getData(){
            return data;
        }

        public void setData(Object data){
            this.data = data;
        }

        public static EnumSingleton getInstance(){
            return INSTANCE;
        }



}
