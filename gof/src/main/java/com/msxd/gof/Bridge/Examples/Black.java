package com.msxd.gof.Bridge.Examples;

/**
 * @author wjhk
 * @date 2020/12/24 11:26
 * 黑色
 */
public class Black implements Color{
    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的"+shape);
    }
}
