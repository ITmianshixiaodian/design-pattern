package com.msxd.gof.Interpreter;

/**
 * @author wjhk
 * @date 2020/12/24 14:58
 * 非终结表达式：加
 */
public class Add implements Interpreter{
    private  Interpreter left;
    private  Interpreter right;

    public Add(Interpreter left,Interpreter right){
        this.left=left;
        this.right=right;
    }
    @Override
    public double calculate(String expression) {
        return left.calculate(expression)+right.calculate(expression);
    }
}
