package com.msxd.gof.Decorator;

import java.math.BigDecimal;

/**
 * 火腿肠配料类（继承自CondimentDecorator）
 */
public class HamSausage extends CondimentDecorator {

    /**
     * 用一个实例变量记录小吃，也就是被装饰者
     */
    Snack snack;

    /**
     * 构造器，初始化小吃
     * @param snack
     */
    public HamSausage(Snack snack){
        this.snack=snack;
    }

    /**
     *在原来小吃的基础上添加 火腿肠 描述
     * @return
     */
    @Override
    public String getDescription() {
        return snack.getDescription()+",火腿肠";
    }

    /**
     * 在原来小吃的基础上加上 火腿肠 的价格
     * @return
     */
    @Override
    public BigDecimal cost() {
        return new BigDecimal(1.0).add(snack.cost());
    }
}
