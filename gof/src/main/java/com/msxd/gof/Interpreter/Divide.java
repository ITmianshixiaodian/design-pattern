package com.msxd.gof.Interpreter;

/**
 * @author wjhk
 * @date 2020/12/24 14:59
 * 非终结表达式：除
 */
public class Divide implements Interpreter{
    private Interpreter left;
    private Interpreter right;
    public Divide(Interpreter left,Interpreter right){
        this.left=left;
        this.right=right;
    }
    @Override
    public double calculate(String expression) {
        double right = this.right.calculate(expression);
        if(right!=0){
            return left.calculate(expression)/right;
        }
        return -1;
    }
}
