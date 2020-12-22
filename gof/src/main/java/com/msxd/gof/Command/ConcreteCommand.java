package com.msxd.gof.Command;

/**
 * @author wjhk
 * @date 2020/12/22 10:28
 * 具体命令
 */
public class ConcreteCommand implements Command{
    private Receiver receiver;
    public ConcreteCommand(){
        receiver=new Receiver();
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
