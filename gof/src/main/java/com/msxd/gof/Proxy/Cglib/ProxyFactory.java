package com.msxd.gof.Proxy.Cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 把目标对象通过构造函数传入
 * 利用工具类创建代理对象接口
 * 实现执行方法
 */
public class ProxyFactory implements MethodInterceptor {
    private Object target;
    public  ProxyFactory(Object target){
        this.target=target;
    }
    public Object getProxyInstance(){

        //创建工具类
        Enhancer en = new Enhancer();

        //创建父类
        en.setSuperclass(target.getClass());

        //设置回滚函数
        en.setCallback(this);

        return en.create();
    }

    //实现
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("前置增强：事务begin");
        Object returnValue = method.invoke(target,args);
        System.out.println("后置增强：事务commit");
        return returnValue;
    }
}
