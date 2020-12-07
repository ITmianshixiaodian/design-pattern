package com.msxd.gof.Singleton;

public class LazySingleton {
    private static LazySingleton instance=null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
