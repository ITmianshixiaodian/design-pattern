package com.msxd.gof.Visitor;

/**
 * @author wjhk
 * @date 2020/12/22 11:43
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure os =new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());

        Visitor visitor =new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("-----------------------");
        visitor=new ConcreteVisitorB();
        os.accept(visitor);


    }
}
