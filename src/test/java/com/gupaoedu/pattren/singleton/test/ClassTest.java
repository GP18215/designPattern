package com.gupaoedu.pattren.singleton.test;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/13
 * Time: 16:30
 * Description: No Description
 */
public class ClassTest {
    public static void main(String[] str){
        System.out.println("主函数执行 new TestStaticClass()");
        TestStaticClass test=new TestStaticClass();
        test.outMethon();
    }
}
