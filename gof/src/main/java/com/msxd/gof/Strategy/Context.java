package com.msxd.gof.Strategy;

/**
 * @author wjhk
 * @date 2020/12/21 9:52
 * 策略环境类
 */
public class Context {
    private  Strategy strategy;
    public Strategy getStrategy()
    {
        return strategy;
    }
    public void setStrategy(Strategy strategy)
    {
        this.strategy=strategy;
    }
    public void strategyMethod()
    {
        strategy.strategyMethod();
    }
}
