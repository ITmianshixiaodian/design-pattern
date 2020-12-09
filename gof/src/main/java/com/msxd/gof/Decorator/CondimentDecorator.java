package com.msxd.gof.Decorator;

/**
 *配料装饰着抽象类（继承自小吃抽象类）
 */
public abstract class CondimentDecorator  extends Snack{

    /**
     * 所有的配料装饰者都必须重新实现getDescription()方法
     * 这样才能够用递归的方式来得到所选小吃的整体描述
     * @return
     */
    public abstract String getDescription();
}
