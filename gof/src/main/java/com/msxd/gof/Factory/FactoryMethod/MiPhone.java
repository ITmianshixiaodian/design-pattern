package com.msxd.gof.Factory.FactoryMethod;

/**
 * @author wjhk
 * @date 2020/12/18 17:08
 */
public class MiPhone implements Phone {
    public MiPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制作小米手机！");

    }
}
