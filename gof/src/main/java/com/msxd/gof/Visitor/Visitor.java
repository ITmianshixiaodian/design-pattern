package com.msxd.gof.Visitor;

/**
 * @author wjhk
 * @date 2020/12/22 11:27
 * 抽象访问者
 */
public interface Visitor {
    void visitor(ConcreteElementA element);
    void visitor(ConcreteElementB element);

}
