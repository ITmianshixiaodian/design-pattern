package com.msxd.gof.Factory.AbstractFactory;

/**
 * @author wjhk
 * @date 2020/12/18 17:24
 */
public class MiPC implements PC{
    public MiPC(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制作小米PC");
    }
}
