package com.msxd.gof.Composite;

public abstract class Node {
    protected String name;

    public  Node(String name){
        this.name=name;
    }

    public  Node addNode(Node node) throws Exception{
        throw new Exception("不支持");
    }
    abstract void display();
}
