package com.msxd.gof.Decorator;

import java.math.BigDecimal;

/**
 * 手抓饼
 */
public class ShreddedPancake extends Snack {

    /**
     * 说明这个是手抓饼
     */
    public  ShreddedPancake(){
        description="手抓饼";
    }

    /**
     * 实现cost方法，用来返回ShreddedPancake（手抓饼）的价格
     * @return
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal(4.50);
    }
}
