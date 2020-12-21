package com.msxd.gof.Builder.Examples;

/**
 * @author wjhk
 * @date 2020/12/21 16:17
 */
public class Test {
    public static void main(String[] args) {
        //客户点了套餐A
        MealA a  = new MealA();
        //准备套餐A的服务员
        Director director =new Director(a);
        //获取套餐A
        Meal mealA = director.construct();
        System.out.println("套餐A的组成部分：");

        System.out.println("食物："+mealA.getFood()+";     饮品："+mealA.getDrink());

        MealB b = new MealB();

        director = new Director(b);
        Meal mealB =director.construct();
        System.out.println("-------******-------");
        System.out.println("套餐B的组成部分：");

        System.out.println("食物："+mealB.getFood()+";     饮品："+mealB.getDrink());

    }
}
