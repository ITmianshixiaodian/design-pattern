package com.msxd.gof.Visitor;

/**
 * @author wjhk
 * @date 2020/12/22 11:28
 * 具体元素类
 */
public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public String operationA(){
        return "具体元素A的操作";
    }
}
