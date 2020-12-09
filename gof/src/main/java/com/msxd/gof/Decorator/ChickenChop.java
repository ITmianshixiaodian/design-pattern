package com.msxd.gof.Decorator;

import java.math.BigDecimal;

/**
 * 鸡排 配料类（继承自CondimentDecorator）
 */
public class ChickenChop  extends CondimentDecorator{
    Snack   snack;

    public  ChickenChop(Snack snack){
        this.snack=snack;
    }
    @Override
    public String getDescription() {
        return snack.getDescription()+",鸡排";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(2.50).add(snack.cost());
    }
}
