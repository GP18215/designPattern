package com.gupaoedu.pattren.strategy.pay.payport;


/**
 * 京东付款
 */
public class JDPay extends Payment {

    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
