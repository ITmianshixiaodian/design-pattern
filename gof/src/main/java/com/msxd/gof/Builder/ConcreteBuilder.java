package com.msxd.gof.Builder;

/**
 * @author wjhk
 * @date 2020/12/21 14:41
 * 建造者模式--具体建造者
 */
public class ConcreteBuilder implements Builder {
    private Product product;
    public ConcreteBuilder(){
        product=new Product();
    }

    @Override
    public void setPartA() {
        product.setPartA("Part A");

    }

    @Override
    public void setPartB() {
        product.setPartB("Part B");

    }

    @Override
    public void setPartC() {
        product.setPartC("Part C");

    }

    @Override
    public Product build() {
        return product;
    }
}
