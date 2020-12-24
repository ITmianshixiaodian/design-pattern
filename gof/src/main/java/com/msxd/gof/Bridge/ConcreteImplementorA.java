package com.msxd.gof.Bridge;

/**
 * @author wjhk
 * @date 2020/12/24 11:04
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
