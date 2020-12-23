package com.msxd.gof.State;

import ch.qos.logback.classic.spi.STEUtil;

/**
 * @author wjhk
 * @date 2020/12/23 16:20
 * 状态模式--环境类
 */
public class Context {
    private State state;

    //定义环境类的初始状态
    public Context(){
        this.state =new ConcreteStateA();
    }

    //设置新的状态
    public void setState(State state){
        this.state=state;
    }

    //读取状态
    public State getState(){
        return state;
    }
    public void handle(){
        state.handle(this);
    }
}
