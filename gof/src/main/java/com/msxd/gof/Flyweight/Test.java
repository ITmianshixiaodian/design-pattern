package com.msxd.gof.Flyweight;

/**
 * @author wjhk
 * @date 2020/12/22 15:45
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f11 = factory.getFlyweight("b");
        Flyweight f12 = factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("第一次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第二次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第三次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第一次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第二次调用b。"));
    }
}
