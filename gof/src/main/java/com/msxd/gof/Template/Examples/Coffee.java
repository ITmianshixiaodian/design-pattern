package com.msxd.gof.Template.Examples;

public class Coffee extends RereshBaverage {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入点糖和牛奶");

    }
}
