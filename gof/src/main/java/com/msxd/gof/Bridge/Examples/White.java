package com.msxd.gof.Bridge.Examples;

/**
 * @author wjhk
 * @date 2020/12/24 11:24
 * 白色
 */
public class White implements Color{
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的"+shape);
    }
}
