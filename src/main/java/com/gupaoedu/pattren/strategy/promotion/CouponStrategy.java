package com.gupaoedu.pattren.strategy.promotion;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/15
 * Time: 13:05
 * Description: 优惠券
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,直接抵扣课程费用");
    }
}
