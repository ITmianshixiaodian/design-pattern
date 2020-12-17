package com.msxd.gof.Template.Examples;

public class Test {
    public static void main(String[] args) {

        System.out.println("咖啡准备制作中。。。");
        RereshBaverage coffee=new Coffee();
        coffee.preperBvergeTemplate();
        System.out.println("咖啡制作完成！");
        System.out.println("\n*****************************************************\n");

        System.out.println("茶制作中。。。。");
        RereshBaverage tea = new Tea();
        tea.preperBvergeTemplate();
        System.out.println("茶制作完成!");
        System.out.println("\n*****************************************************\n");

        System.out.println("蜂蜜柚子茶制作中。。。");
        RereshBaverage honeyPomeloTea = new HoneyPomeloTea();
        honeyPomeloTea.preperBvergeTemplate();
        System.out.println("蜂蜜柚子茶制作完成！");

    }

}
