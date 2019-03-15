package com.gupaoedu.pattren.strategy.pay.payport;


/**
 * 支付宝付款
 */
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

}
