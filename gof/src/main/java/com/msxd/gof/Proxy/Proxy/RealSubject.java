package com.msxd.gof.Proxy.Proxy;

public class RealSubject implements Subject {
    public void save(){
        System.out.println("数据已保存！");
    }
}
