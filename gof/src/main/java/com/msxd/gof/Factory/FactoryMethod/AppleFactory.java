package com.msxd.gof.Factory.FactoryMethod;

/**
 * @author wjhk
 * @date 2020/12/18 17:10
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
