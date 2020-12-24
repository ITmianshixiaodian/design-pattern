package com.msxd.gof.Bridge;

/**
 * @author wjhk
 * @date 2020/12/24 11:06
 * 接桥模式--抽象化角色
 */
public abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple){
        this.imple=imple;
    }
    public abstract void Operation();
}
