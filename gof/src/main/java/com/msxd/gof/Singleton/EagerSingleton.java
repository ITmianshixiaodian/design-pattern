package com.msxd.gof.Singleton;

/**
 * 饿汉单例
 * 1加载类时候就初始化了instance
 */
public class EagerSingleton {
    private static EagerSingleton instance=new EagerSingleton();
    private EagerSingleton(){}
    public  static  EagerSingleton getInstance(){
        return  instance;
    }
}
