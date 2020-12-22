package com.msxd.gof.Visitor;

/**
 * @author wjhk
 * @date 2020/12/22 11:30
 * 具体元素类
 */
public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public String operationB(){
        return "具体元素B的操作";
    }
}
