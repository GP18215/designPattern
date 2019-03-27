package com.gupaoedu.pattren.proxy.dynamicProxy.mycProxy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/25
 * Time: 13:16
 * Description: 用来生成源代码的工具类
 */
public class mycProxy {

    public static final String ln = "\r\n";//换行

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
            sb.append("private GPInvocationHandler h;"+ln);
            sb.append("public $Proxy0(GPInvocationHandler h){"+ln);
                    sb.append("this.h = h;"+ln);
            sb.append("}"+ln);

        for (Method method : interfaces[0].getMethods()) {
            Class<?>[] params = method.getParameterTypes();//形参
            StringBuffer paramNames = new StringBuffer();
            StringBuffer paramValues = new StringBuffer();
            StringBuffer paramClasses = new StringBuffer();

            for(int i=0 ; i<params.length ; i++){
                    Class clazz = params[i];
                    String type = clazz.getName();//全称 java.lang.String
                    String paramName = toLowerFirstCase(clazz.getSimpleName());//简称String
                    paramNames.append(type + "" +paramName);
                    paramValues.append(paramName);
                    paramClasses.append(clazz.getName()+".class");

                    if(i>0 && i< params.length-1){
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
            }
            sb.append("public "+method.getReturnType().getName() + " "+method.getName() + "(" +
                    paramNames.toString() +") {" +ln);
                   sb.append("try{"+ln);
                      sb.append("Method m = " +interfaces[0].getName() + ".class.getMethod(\""
            + method.getName() +"\",new class[]{"+paramClasses.toString() +"});"+ln);
                           sb.append((hasReturnValue(method.getReturnType()) ? "reurn ": "")+
                           getCaseCode("this.h.invoke(this,m,new Object[]{"+paramValues+"})", method.getReturnType())+";"+ln);
                   sb.append("}catch(Error _ex){ }"+ln);
                   sb.append("catch(Throwable e){" +ln);
                   sb.append("throw new UndeclaredThrowableException(e);"+ln);
                   sb.append("}"+ln);
                   sb.append(getReturnEmptyCode(method.getReturnType()));
                sb.append("}"+ln);

        }


        sb.append("}"+ln);
        System.out.println(sb.toString());
        return sb.toString();
    }

    private static Map<Class,Class> mappings = new HashMap<Class,Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else{
            return "return null;";
        }

    }
    private static String getCaseCode(String code ,Class<?> returnClass){
            if(mappings.containsKey(returnClass)){
                return "(("+mappings.get(returnClass.getName())+")" + code + ")."+
                        returnClass.getSimpleName() + "Value()";
            }
            return  code;
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
    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;

    }
}
