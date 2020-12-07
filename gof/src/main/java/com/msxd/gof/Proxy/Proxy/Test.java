package com.msxd.gof.Proxy.Proxy;

public class Test {
    public static void main(String[] args) {

        Subject target = new RealSubject();

        Subject proxy = (Subject) new ProxyFactory(target).getProxyInstance();

        proxy.save();
    }
}
