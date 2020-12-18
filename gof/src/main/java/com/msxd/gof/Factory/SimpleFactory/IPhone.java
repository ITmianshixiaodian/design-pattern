package com.msxd.gof.Factory.SimpleFactory;

/**
 * @author wjhk
 * @date 2020/12/18 16:52
 * 制作苹果手机
 */
public class IPhone implements Phone{

    public IPhone(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("制作IPhone手机！");
    }
}
