package com.msxd.gof.Builder.Examples;

/**
 * @author wjhk
 * @date 2020/12/21 16:12
 */
public class MealB implements Builder {
    private Meal meal;

    public MealB(){
        meal=new Meal();
    }
    @Override
    public Meal build() {
        return meal;
    }

    @Override
    public void buildFood() {
        meal.setFood("汉堡包");

    }

    @Override
    public void buildDrink() {
        meal.setDrink("柠檬果汁");
    }
}
