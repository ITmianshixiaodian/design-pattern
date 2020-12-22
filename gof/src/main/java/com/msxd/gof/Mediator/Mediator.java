package com.msxd.gof.Mediator;

/**
 * @author wjhk
 * @date 2020/12/22 14:26
 */
public  abstract class Mediator {
    abstract void register(Colleague colleague);

    abstract void relay(Colleague cl);
}
