package com.msxd.gof.Iterator;

/**
 * @author wjhk
 * @date 2020/12/21 17:18
 * 抽象迭代器
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
