package com.msxd.gof.Builder.Examples;

/**
 * @author wjhk
 * @date 2020/12/21 16:05
 */
public interface Builder {
    Meal build();

    void buildFood();

    void buildDrink();
}
