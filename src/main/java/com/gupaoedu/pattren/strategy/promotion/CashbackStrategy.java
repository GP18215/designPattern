package com.gupaoedu.pattren.strategy.promotion;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/15
 * Time: 13:06
 * Description: No Description
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("购课返现金,现金将返回支付宝账户！");
    }
}
