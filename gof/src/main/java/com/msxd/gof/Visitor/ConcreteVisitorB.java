package com.msxd.gof.Visitor;

/**
 * @author wjhk
 * @date 2020/12/22 11:36
 */
public class ConcreteVisitorB implements Visitor{
    @Override
    public void visitor(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->"+element.operationA());
    }

    @Override
    public void visitor(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->"+element.operationB());
    }
}
