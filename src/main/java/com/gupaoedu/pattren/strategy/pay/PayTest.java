package com.gupaoedu.pattren.strategy.pay;

public class PayTest {
    public static void main(String[] args) {

        String payKey = "WechatPay";

       Order order = new Order("1","20190315002",500);
        System.out.println(order.pay(payKey));
    }
}
