package com.msxd.gof.Factory.AbstractFactory;

/**
 * @author wjhk
 * @date 2020/12/18 17:09
 */
public class IPhone implements Phone {
    public IPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制作Iphone手机！");
    }
}
