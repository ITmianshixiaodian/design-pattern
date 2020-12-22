package com.msxd.gof.Visitor;

/**
 * @author wjhk
 * @date 2020/12/22 11:27
 * 抽象元素类
 */
public interface Element {
    void accept(Visitor visitor);
}
