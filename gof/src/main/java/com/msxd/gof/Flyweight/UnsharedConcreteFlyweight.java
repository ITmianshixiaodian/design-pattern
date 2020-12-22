package com.msxd.gof.Flyweight;

/**
 * @author wjhk
 * @date 2020/12/22 15:33
 */
public class UnsharedConcreteFlyweight {
    private String info;

    UnsharedConcreteFlyweight(String info){
        this.info =info;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info=info;
    }
}
