package com.gupaoedu.pattren.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    //单例＋工厂
    private static final String COUPON = "COUPON";
    private static final String CASHBACK = "CASHBACK";
    private static final String GROUPBUY = "GROUPBUY";
    private static final PromotionStrategy EMPTY = new EmptyStrategy();

    private static Map<String,PromotionStrategy> PROMTION_STRATEGY_MAP =
                                               new HashMap<String,PromotionStrategy>();
    //初始化对象
    static {
        PROMTION_STRATEGY_MAP.put(COUPON,new CouponStrategy());

        PROMTION_STRATEGY_MAP.put(GROUPBUY,new GroupbuyStrategy());

        PROMTION_STRATEGY_MAP.put(CASHBACK,new CashbackStrategy());

    }


    public static PromotionStrategy getStrategy(String promotionKey){

        //如果有值则传回改对象，如果没有则传回默认对象策略
        PromotionStrategy promotionStrategy = PROMTION_STRATEGY_MAP.get(promotionKey);
        return  promotionStrategy == null ? EMPTY : promotionStrategy;
    };

}
