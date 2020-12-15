package com.msxd.gof.Proxy.Cglib;

public class Test {
    public static void main(String[] args) {
        //创建目标对象
        UserDao target = new UserDao();
        //创建目标的代理对象
        UserDao proxy =(UserDao) new ProxyFactory(target).getProxyInstance();

        proxy.save();
    }
}
