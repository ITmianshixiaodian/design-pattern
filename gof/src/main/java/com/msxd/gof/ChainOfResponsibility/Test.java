package com.msxd.gof.ChainOfResponsibility;

/**
 * @author wjhk
 * @date 2020/12/23 14:24
 */
public class Test {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setNext(h2);
        h1.handleRequest("two");
    }
}
