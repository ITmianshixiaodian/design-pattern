package com.msxd.gof.Decorator;

import java.math.BigDecimal;

/**
 * 地摊小吃 抽象类
 */
public abstract class Snack {
    String description="Unknown Snack";

    public  String getDescription(){
        return description;
    }

    /**
     * cost方法是用来返回小吃的价钱（需在具体类中自己实现）
     * @return
     */
    public abstract BigDecimal cost();
}
