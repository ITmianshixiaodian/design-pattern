package com.msxd.gof.Template.Examples;

/**
 *
 */
public abstract class RereshBaverage {
    /**
     * 制作饮料的模板方法
     * 封装了所有子类共同遵守的算法骨架
     */
    public final void preperBvergeTemplate(){
        //第一步 ，把水煮沸
        boilWater();

        //第二步，炮制饮料
        brew();

        //第三步，将饮料倒入杯中
        pourInCup();

        //第四步，加入调味料
        if(isCusomerWantsCondiments()){
            addCondiments();
        }

    }

    /**
     * 基本方法，将水煮沸。这对所有子类而言是一个共同的行为，所以声明为private，不对子类开放
     */
    private void boilWater(){
        System.out.println("将水煮沸。");

    }

    /**
     * 抽象的基本方法：泡制饮料
     * 在算法框架中并不知道具体实现是什么样子的，所以做成抽象方法，并且由于我们需要在子类中可见
     * 权限设置protected
     */
    protected abstract void brew();

    private void pourInCup(){
        System.out.println("将饮料倒入杯中。。");


    }

    /**
     * Hook 钩子函数，提供一个默认或空方法
     * 具体的子类可以决定是否挂钩或如何挂钩
     * 询问客户是否需要加入调料
     * @return
     */
    protected boolean isCusomerWantsCondiments(){
        return true;
    }

    /**
     * 加入调料
     */
    protected abstract void addCondiments();
}
