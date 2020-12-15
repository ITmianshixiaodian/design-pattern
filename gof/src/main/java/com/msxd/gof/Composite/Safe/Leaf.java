package com.msxd.gof.Composite.Safe;

public class Leaf implements Component{
    private String name;
    public Leaf(String name){
        this.name=name;
    }
    @Override
    public void operation() {
        System.out.println("树叶"+name+"被访问到！");
    }
}