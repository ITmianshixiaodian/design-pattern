package com.msxd.gof.Singleton;

/**
 * 静态类内部类单例
 *
 */
public class Singleton {
    private  static  class SingletonHolder{
        private  static  final  Singleton  Instance =new Singleton();
    }
    private  Singleton(){}

    public  static  Singleton getInstance(){
        return  SingletonHolder.Instance;
    }
}