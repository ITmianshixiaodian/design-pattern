package com.msxd.gof.Builder;

/**
 * @author wjhk
 * @date 2020/12/21 14:48
 */
public class Test {
    public static void main(String[] args) {
        //建造者
        Builder builder = new ConcreteBuilder();
        //指挥者
        Director director = new Director(builder);
        //指挥者创建产品返回产品
        Product product =director.construct();
        System.out.println(product);
    }
}
