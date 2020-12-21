package com.msxd.gof.Iterator;

/**
 * @author wjhk
 * @date 2020/12/21 17:31
 */
public class Test {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华侨大学");
        ag.add("华南理工");
        ag.add("韶关大学");
        System.out.println("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj.toString());
        }
        Object ob = it.first();
        System.out.println("First:"+ob.toString());
    }
}
