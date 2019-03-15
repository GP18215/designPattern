package com.gupaoedu.pattren.strategy.promotion;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/3/15
 * Time: 13:11
 * Description: 优惠活动
 */
public class PromotionActivity {
    private PromotionStrategy ps;

    public PromotionActivity(PromotionStrategy ps){
        this.ps = ps;
    }

    public void excute(){
        ps.doPromotion();
    }
}
