package com.msxd.gof.Builder.Examples;

/**
 * @author wjhk
 * @date 2020/12/21 16:14
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public Meal construct(){
        //准备食物
        builder.buildFood();
        //准备饮料
        builder.buildDrink();
        //准备完毕，返回一个完整的套餐给客户
        return builder.build();
    }
}
