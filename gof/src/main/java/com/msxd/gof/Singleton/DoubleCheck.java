package com.msxd.gof.Singleton;

/**
 * DCL 双重校验单例
 * 问1. instance 为什么要加 volatile？
 * 答：volatile为了保证指令重排序。防止拿到半初始化的instance
 */

public class DoubleCheck {
    private  static  volatile DoubleCheck instance=null;
    private  DoubleCheck (){}
    public  static  DoubleCheck getInstance(){

        if(instance==null){
            synchronized(DoubleCheck.class){
                if(instance==null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return  instance;
    }
}
