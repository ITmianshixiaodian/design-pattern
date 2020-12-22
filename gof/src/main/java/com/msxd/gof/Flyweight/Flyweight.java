package com.msxd.gof.Flyweight;

/**
 * @author wjhk
 * @date 2020/12/22 15:30
 * 抽象享元角色
 */
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}
