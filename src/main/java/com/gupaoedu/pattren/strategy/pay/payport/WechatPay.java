package com.gupaoedu.pattren.strategy.pay.payport;

/**
 * 微信支付
 */
public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }

}
