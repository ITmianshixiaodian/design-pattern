package com.msxd.gof.Interpreter;

/**
 * @author wjhk
 * @date 2020/12/24 14:56
 * 解释器模式--终结符表达式
 */
public class Number implements Interpreter{
    private double number;

    public Number(double number){
        this.number=number;
    }

    @Override
    public double calculate(String expression) {
        return number;
    }
}
