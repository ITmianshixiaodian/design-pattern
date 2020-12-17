package com.msxd.gof.Template.Examples;

public class Tea extends RereshBaverage {
    @Override
    protected void brew() {
        System.out.println("用80°的热水浸泡茶叶5分钟");
    }
    protected boolean isCusomerWantsCondiments(){
        return false;
    }

    @Override
    protected void addCondiments() {

    }
}
