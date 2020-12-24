package com.msxd.gof.Interpreter;

/**
 * @author wjhk
 * @date 2020/12/24 14:50
 * 解释器模式--抽象表达式
 */
public interface Interpreter {
    double calculate(String expression);
}
