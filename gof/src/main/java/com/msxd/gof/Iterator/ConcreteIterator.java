package com.msxd.gof.Iterator;

import java.util.List;

/**
 * @author wjhk
 * @date 2020/12/21 17:18
 * 具体迭代器
 */
public class ConcreteIterator implements  Iterator{
    private List<Object> list=null;
    private int index =-1;
    public ConcreteIterator(List<Object> list){
        this.list=list;
    }

    @Override
    public Object first() {
        index=0;
        Object first = list.get(index);
        return first;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
           return  list.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(index<list.size()-1){
            return true;
        }
        return false;
    }
}
