package com.msxd.gof.Proxy;
/*
被代理的角色
 */
public class RealSubject implements Subject {
    public  void  doSomething(){
        System.out.println("call doSomething()");
    }

}
