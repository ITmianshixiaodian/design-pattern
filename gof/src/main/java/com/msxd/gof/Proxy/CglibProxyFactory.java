package com.msxd.gof.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    private  Object target;
    public  CglibProxyFactory(Object target){
        this.target=target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        Enhancer en  = new Enhancer();

        en.setSuperclass(target.getClass());

        en.setCallback(this);

        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务begin。。。");

        //执行目标对象的方法
        Object returnValue = method.invoke(target,args);

        System.out.println("事务commit。。。");
        return returnValue;
    }
}
