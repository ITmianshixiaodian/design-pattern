package com.msxd.gof.Builder;

/**
 * @author wjhk
 * @date 2020/12/21 14:38
 * 建造者模式--抽象建造者
 */
public interface Builder {
     void setPartA();

     void setPartB();

     void setPartC();

     Product build();

}
