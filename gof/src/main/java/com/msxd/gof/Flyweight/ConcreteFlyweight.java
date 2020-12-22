package com.msxd.gof.Flyweight;

/**
 * @author wjhk
 * @date 2020/12/22 15:36
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;

    ConcreteFlyweight(String key){
        this.key=key;
        System.out.println("具体享元"+key+"被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是："+outState.getInfo());

    }
}
