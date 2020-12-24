package com.msxd.gof.Interpreter;

import java.util.LinkedList;

/**
 * @author wjhk
 * @date 2020/12/24 15:25
 */
public class ParserInterpreter implements Interpreter {
    @Override
    public double calculate(String expression) {
        StringBuilder number = new StringBuilder();
        LinkedList<Interpreter> interpreters = new LinkedList<>();
        LinkedList<Character> operators = new LinkedList<>();
        for (char ch :expression.toCharArray()){
            if(isOperator(ch)){
                if(number.length()>0){
                    interpreters.add(new Number(Double.parseDouble(number.toString())));
                    number.setLength(0);
                }
                while (interpreters.size()>=2){
                    Character lastOp= operators.getLast();
                    //碰到左括号
                    if(isOpenParen(lastOp)){
                        break;
                    }
                    //碰到了运算符，但下一个运算符优先级是否更高？
                    if(rightOperatorGreater(lastOp,ch)){
                        break;
                    }

                    Interpreter right = interpreters.removeLast();
                    Interpreter left =interpreters.removeLast();
                    Interpreter interpreter =  constructExpression(left,operators.removeLast(),right);
                    interpreters.addLast(interpreter);
                }
                if(isCloseParen(ch)){
                    //碰到右括号，直接去掉左括号
                    operators.removeLast();
                }else{
                    //非右括号，直接进栈
                    operators.addLast(ch);
                }

            }else{
                number.append(ch);
            }

        }
        if(number.length()>0){
            interpreters.add(new Number(Double.parseDouble(number.toString())));
            number.setLength(0);

        }
        if(operators.size()>0){
            Interpreter right = interpreters.removeLast();
            Interpreter left =interpreters.removeLast();
            Interpreter interpreter =constructExpression(left,operators.removeLast(),right);
            interpreters.addLast(interpreter);
        }

        return interpreters.pop().calculate(expression);
    }

    private boolean isOperator(char ch){
        return    ch=='-'||ch=='+'||ch=='*'
                ||ch=='/'||ch=='('||ch==')';
    }

    private boolean isOpenParen(char ch){
        return ch=='(';
    }

    private boolean isCloseParen(char ch){
        return ch==')';
    }

    private boolean rightOperatorGreater(char leftOp,char rightOp){

        if(rightOp=='*'||rightOp=='/'){
            return leftOp=='+'||leftOp=='-';
        }
        return false;
    }

    private Interpreter constructExpression(Interpreter left , char op,Interpreter right){
        switch (op){
            case '+':
                return new Add(left,right);
            case'-':
                return new Subtract(left,right);
            case'*':
                return new Multiply(left,right);
            case'/':
                return new Divide(left,right);
        }
        return null;
    }
}
