package com.msxd.gof.Template;
/*
模板方法 模式
 */
// 抽象类
public abstract class AbstractClass {
    public void TemplateMethod(){
        SpecificMethod();
        HookMethod1();
        abstractMethod1();
        if(HookMethod2()){
            abstractMethod2();
        }
    }
    //钩子方法1
    public void HookMethod1() {
    }
    //钩子方法2
    public boolean HookMethod2() {
        return true;
    }
    //具体方法
    public void SpecificMethod(){
        System.out.println("抽象类中的具体方法被调用。。。");
    }

    //抽象方法1
    public abstract void abstractMethod1();

    //抽象方法2
    public abstract void abstractMethod2();
}
