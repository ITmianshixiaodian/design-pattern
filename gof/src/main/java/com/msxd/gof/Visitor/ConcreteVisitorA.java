package com.msxd.gof.Visitor;

import java.sql.SQLOutput;

/**
 * @author wjhk
 * @date 2020/12/22 11:35
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visitor(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }

    @Override
    public void visitor(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->"+element.operationB());
    }
}
