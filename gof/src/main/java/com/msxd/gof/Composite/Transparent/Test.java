package com.msxd.gof.Composite.Transparent;

public class Test {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component l1 = new Leaf("leaf1");
        Component l2 = new Leaf("leaf2");
        Component l3 = new Leaf("leaf3");
        c0.add(l1);
        c0.add(c1);
        c1.add(l2);
        c1.add(l3);
        c0.operation();
    }
}
