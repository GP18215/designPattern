package com.gupaoedu.pattren.proxy.dynamicProxy.mycProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/25
 * Time: 13:16
 * Description: 用来生成源代码的工具类
 */
public class mycProxy {

    public static final String ln = "/r/n";//换行

    public static Object newProxyInstance(GPClassLoader classLoader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h){

        try{
            //1.动态生成Java源代码
               String src =  generateSrc(interfaces);
            //2.java文件输出磁盘

            //3.把生成的.java文件编译成.class文件

            //4.编译生成的.class文件加载到JVM中来

            //5.返回字节码重组以后的代理对象

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupaoedu.pattren.proxy.dynamicProxy.mycProxy;"+ln);
        sb.append("import com.gupaoedu.pattren.proxy.Person;"+ln);
        sb.append("import java.lang.reflect.*;"+ln);
        sb.append("public class $Proxy0 implement "+interfaces[0].getName()+"{"+ln);
            sb.append("private GPInvocationHandler h;");
            sb.append("public $Proxy0(GPInvocationHandler h){");
                    sb.append("this.h = h;");
            sb.append("}");

        for (Method method : interfaces[0].getMethods()) {
            Class<?>[] params = method.getParameterTypes();//形参
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for(int i=0 ; i<params.length ; i++){
                    Class clazz = params[i];
                    String type = clazz.getName();//全称 java.lang.String
                    String paramName = toLowerFirstCase(clazz.getSimpleName());//简称String
            }
        }


        sb.append("}");

        return null;
    }

    /**
     * 将首字母小写
     * @param src
     * @return
     */
    private static String toLowerFirstCase(String src){
        char[] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);

    }
}
