package com.gupaoedu.pattren.strategy.promotion;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/15
 * Time: 13:06
 * Description: No Description
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("暂无优惠！");
    }
}
