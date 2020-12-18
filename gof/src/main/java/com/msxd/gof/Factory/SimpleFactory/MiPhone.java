package com.msxd.gof.Factory.SimpleFactory;

/**
 * @author wjhk
 * @date 2020/12/18 16:54
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
