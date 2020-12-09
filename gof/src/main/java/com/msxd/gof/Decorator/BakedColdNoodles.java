package com.msxd.gof.Decorator;

import java.math.BigDecimal;

public class BakedColdNoodles extends Snack {

    public BakedColdNoodles(){
        description="烤冷面";
    }
    @Override
    public BigDecimal cost() {
        return new BigDecimal(5.00);
    }
}
