package com.msxd.gof.Observer;

/**
 * 主题 （发布者，被观察者）
 * 1.注册观察者
 * 2.移除观察者
 * 3.通知观察者
 */
public interface Subject {
    //注册观察者
    void registerObserver(Observer observer);
    //移除观察者
    void removeObserver(Observer observer);
    //通知观察者们
    void notifyObservers();
}
