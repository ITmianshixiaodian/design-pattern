package com.msxd.gof.Decorator;

public class Test {
    public static void main(String[] args) {

        //来个手抓饼
        Snack snack =new ShreddedPancake();
        System.out.println("描述："+snack.getDescription()+snack.cost()+"元");

        //来第二个手抓饼
        Snack snack1 = new ShreddedPancake();
        //加两个鸡排
        snack1=new ChickenChop(snack1);
        snack1=new ChickenChop(snack1);
        //再加个火腿肠
        snack1 = new HamSausage(snack1);
        System.out.println("描述："+snack1.getDescription()+snack1.cost()+"元");

        //来个烤冷面
        Snack snack2 =new BakedColdNoodles();
        System.out.println("描述："+snack2.getDescription()+snack2.cost()+"元");
        //加个火腿肠
        snack2= new HamSausage(snack2);
        System.out.println("描述："+snack2.getDescription()+snack2.cost()+"元");
        //酸辣味
        snack2= new SourAndHot(snack2);
        System.out.println("描述："+snack2.getDescription()+snack2.cost()+"元");
    }
}
