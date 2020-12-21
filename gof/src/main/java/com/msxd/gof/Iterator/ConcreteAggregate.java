package com.msxd.gof.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjhk
 * @date 2020/12/21 17:19
 * 具体聚合
 */
public class ConcreteAggregate implements Aggregate{
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);

    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
