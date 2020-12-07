package com.msxd.gof.Composite;

public class Filter extends Node{

    public Filter(String name){
        super(name);
    }
    @Override
    public void display() {
        System.out.println(name);

    }
}
