package com.msxd.gof.Builder.Examples;

/**
 * @author wjhk
 * @date 2020/12/21 16:07
 */
public class MealA implements Builder {
    private Meal meal;

    public MealA(){
        meal=new Meal();

    }
    @Override
    public Meal build() {
        return meal;
    }

    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
