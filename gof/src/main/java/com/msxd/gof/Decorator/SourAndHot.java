package com.msxd.gof.Decorator;

import java.math.BigDecimal;

public class SourAndHot extends CondimentDecorator {
    Snack snack;
    public  SourAndHot(Snack snack){
        this.snack=snack;
    }
    @Override
    public String getDescription() {
        return snack.getDescription()+",酸辣味";
    }

    @Override
    public BigDecimal cost() {
        return snack.cost();
    }
}
