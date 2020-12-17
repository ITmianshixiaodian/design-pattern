package com.msxd.gof.Template.Examples;

/**
 * 蜂蜜柚子茶
 */
public class HoneyPomeloTea extends RereshBaverage {
    @Override
    protected void brew() {
        System.out.println("用沸水浸泡茶叶3分钟");

    }

    @Override
    protected void addCondiments() {
        System.out.println("加入点蜂蜜和柚子");
    }
}
