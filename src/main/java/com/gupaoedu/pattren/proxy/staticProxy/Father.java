package com.gupaoedu.pattren.proxy.staticProxy;

/**
 * 代理者持有被代理的引用,在代理原方法前后去增强实现
 */
public class Father {
    private Son son;

    public Father(Son son){
        this.son = son;
    }

    public void findLove(){
        System.out.println("父母物色对象...");
        son.findLove();
        System.out.println("父母没意见,同意交往...");
    }
}
