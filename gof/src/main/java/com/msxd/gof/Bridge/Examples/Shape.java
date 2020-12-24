package com.msxd.gof.Bridge.Examples;

/**
 * @author wjhk
 * @date 2020/12/24 11:15
 * 形状抽象类
 */
public abstract class Shape {
    Color color;
    public  void setColor(Color color){
        this.color=color;
    }
    //提供画形状的方法
    public  abstract void draw();
}
