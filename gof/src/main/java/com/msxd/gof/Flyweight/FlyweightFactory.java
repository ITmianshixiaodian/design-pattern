package com.msxd.gof.Flyweight;

import java.util.HashMap;

/**
 * @author wjhk
 * @date 2020/12/22 15:40
 */
public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if(flyweight!=null){
            System.out.println("具体享元"+key+"已存在，被成功获取");
        }else{
            flyweight= new ConcreteFlyweight(key);
            flyweights.put(key,flyweight);
        }
        return flyweight;
    }
}
