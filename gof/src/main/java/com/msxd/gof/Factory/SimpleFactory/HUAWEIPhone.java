package com.msxd.gof.Factory.SimpleFactory;

/**
 * @author wjhk
 * @date 2020/12/18 16:58
 */
public class HUAWEIPhone implements Phone{
    public HUAWEIPhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制作华为手机！");
    }
}
