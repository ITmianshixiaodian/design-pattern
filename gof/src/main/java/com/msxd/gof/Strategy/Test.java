package com.msxd.gof.Strategy;

import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wjhk
 * @date 2020/12/21 9:55
 */
public class Test {
    @Autowired
    Strategy s;
    public static void main(String[] args) {
        Context c =new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("=======================");
        s = new ConctreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
