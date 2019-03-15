package com.gupaoedu.pattren.strategy.promotion;

public class PromotionStrategyTest {
    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";

        PromotionStrategy ps = PromotionStrategyFactory.getStrategy(promotionKey);

        ps.doPromotion();
    }
}
