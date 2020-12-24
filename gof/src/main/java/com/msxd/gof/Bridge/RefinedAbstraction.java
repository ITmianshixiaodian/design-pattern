package com.msxd.gof.Bridge;

/**
 * @author wjhk
 * @date 2020/12/24 11:08
 * 接桥模式--扩展抽象化角色
 */
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();

    }
}
