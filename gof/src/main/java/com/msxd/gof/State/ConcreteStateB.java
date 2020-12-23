package com.msxd.gof.State;

/**
 * @author wjhk
 * @date 2020/12/23 16:34
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B。");
        context.setState(new ConcreteStateA());
    }
}
