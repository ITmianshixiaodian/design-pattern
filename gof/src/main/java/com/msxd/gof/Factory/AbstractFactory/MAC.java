package com.msxd.gof.Factory.AbstractFactory;

/**
 * @author wjhk
 * @date 2020/12/18 17:23
 */
public class MAC implements PC {
    public MAC(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制作MAC！");
    }
}
