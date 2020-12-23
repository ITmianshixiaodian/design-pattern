package com.msxd.gof.State;

/**
 * @author wjhk
 * @date 2020/12/23 16:21
 * 状态模式--具体状态类A
 */
public class ConcreteStateA extends State{

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A。");
        context.setState(new ConcreteStateB());
    }
}
