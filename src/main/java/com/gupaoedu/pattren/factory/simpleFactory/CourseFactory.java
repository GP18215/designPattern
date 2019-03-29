package com.gupaoedu.pattren.factory.simpleFactory;

import com.gupaoedu.pattren.factory.ICource;

public class CourseFactory {
    public ICource create(Class<? extends ICource> clazz){

//        if("java".equals(className)){//最原始的ifelse判断
//            return new JavaCource();
//        }else if("python".equals(className)){
//            return new PythonCource();
//        }else{
//            return null;
//        }
// ------------------------------------------------------------------------------------------
//        try {
//            if(!(null == className || "".equals(className))){//传入类名，利用反射动态创建对象,但参数是字符串
//                return (ICource) Class.forName(className).newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        try {
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
