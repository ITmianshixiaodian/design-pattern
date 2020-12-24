package com.msxd.gof.Bridge;

/**
 * @author wjhk
 * @date 2020/12/24 11:10
 */
public class Test {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction asb = new RefinedAbstraction(imple);
        asb.Operation();
    }
}
