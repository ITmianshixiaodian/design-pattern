package com.msxd.gof.Memento;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wjhk
 * @date 2020/12/24 17:41
 */
public class Test {
    public static void main(String[] args) {
        Originator or =new Originator();
        Caretaker cr =  new Caretaker();
        or.setState("S0");

        System.out.println("初始状态："+or.getState());
        cr.setMemento(or.createMemento());//保存状态

        or.setState("S1");
        System.out.println("新的状态："+ or.getState());

        or.restoreMemento(cr.getMemento());//恢复状态
        System.out.println("恢复状态："+or.getState());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            System.out.println(formatter.parse("2020-10-10 10:10:10"));

            System.out.println(Date.parse("2020/10/10 10:10:10"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
