package com.gupaoedu.pattren.strategy.pay.payport;

import com.gupaoedu.pattren.strategy.pay.MsgResult;

public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid,double amount){
        double blance =  queryBalance(uid);
        if(amount > blance ){
            return new MsgResult(500,"支付失败!","余额不足!");
        }else{
            return  new MsgResult(200,"支付成功!","支付金额:"+amount);
        }
    }
}
