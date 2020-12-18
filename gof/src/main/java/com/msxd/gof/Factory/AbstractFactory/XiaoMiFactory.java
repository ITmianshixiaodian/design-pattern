package com.msxd.gof.Factory.AbstractFactory;

/**
 * @author wjhk
 * @date 2020/12/18 17:08
 */
public class XiaoMiFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
