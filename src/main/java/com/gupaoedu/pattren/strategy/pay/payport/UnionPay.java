package com.gupaoedu.pattren.strategy.pay.payport;

/**
 * 银联卡付款
 */
public class UnionPay extends Payment {

    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }

}
