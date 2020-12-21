package com.msxd.gof.Strategy;

/**
 * @author wjhk
 * @date 2020/12/21 9:49
 * 具体策略类A
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被调用！");
    }
}
