package com.msxd.gof.State;

/**
 * @author wjhk
 * @date 2020/12/23 16:06
 * 状态模式--抽象状态类
 */
public abstract class State {
    public abstract void handle(Context context);
}
