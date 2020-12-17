package com.msxd.gof.Template;

public class ConcreteClass extends AbstractClass {
    @Override
    public void HookMethod1() {
        System.out.println("钩子方法1被调用了。。。");
    }

    public boolean HookMethod2(){
        return false;
    }
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用。。。");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用。。。");

    }
}
