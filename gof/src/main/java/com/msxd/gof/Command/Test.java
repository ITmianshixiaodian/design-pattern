package com.msxd.gof.Command;

/**
 * @author wjhk
 * @date 2020/12/22 10:30
 */
public class Test {
    public static void main(String[] args) {
        Command cmd  =new ConcreteCommand();
        Invoker ir  = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法。。。");
        ir.call();
    }
}
