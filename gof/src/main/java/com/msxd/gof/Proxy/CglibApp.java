package com.msxd.gof.Proxy;

public class CglibApp {

    public static void main(String[] args) {
        CglibUserDao target =new CglibUserDao();

        CglibUserDao proxy =(CglibUserDao)new CglibProxyFactory(target).getProxyInstance();

        proxy.save();
    }
}
