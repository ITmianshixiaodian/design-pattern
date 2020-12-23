package com.msxd.gof.ChainOfResponsibility;

/**
 * @author wjhk
 * @date 2020/12/23 14:11
 * 抽象处理者角色
 */
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next){
        this.next=next;
    }

    public Handler getNext(){
        return next;
    }

    public abstract void handleRequest(String request);
}
