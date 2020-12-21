package com.msxd.gof.Iterator;

/**
 * @author wjhk
 * @date 2020/12/21 17:17
 * 抽象聚合
 */
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);

    Iterator getIterator();
}
