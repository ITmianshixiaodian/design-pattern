package com.msxd.gof.Factory.FactoryMethod;

/**
 * @author wjhk
 * @date 2020/12/18 17:11
 */
public class Test {
    public static void main(String[] args) {
        //制作哪个手机，把哪个手机的工厂调出来
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory iphoneFactory = new AppleFactory();
        miFactory.makePhone();
        iphoneFactory.makePhone();
    }
}
