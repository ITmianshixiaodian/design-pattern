package com.msxd.gof.Builder;

import java.util.Base64;

/**
 * @author wjhk
 * @date 2020/12/21 14:44
 * 建造者模式--指挥者
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder =builder;
    }

    public Product construct(){
        builder.setPartA();
        builder.setPartB();
        builder.setPartC();
        return builder.build();
    }
}
