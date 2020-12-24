package com.msxd.gof.Interpreter;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author wjhk
 * @date 2020/12/24 16:14
 */
public class Test {
    public static void main(String[] args) {
        ParserInterpreter interpreter =new ParserInterpreter();
        double result =interpreter.calculate("20*(3+1)-4*5+3");
        System.out.println("计算结果为："+result);
    }
}
