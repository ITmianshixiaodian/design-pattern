package com.msxd.gof.Bridge.Examples;

/**
 * @author wjhk
 * @date 2020/12/24 11:26
 * 灰色
 */
public class Gray implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的"+shape);
    }
}
