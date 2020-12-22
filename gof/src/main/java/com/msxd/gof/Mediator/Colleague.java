package com.msxd.gof.Mediator;

/**
 * @author wjhk
 * @date 2020/12/22 14:26
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void receive();

    public abstract void send();
}
