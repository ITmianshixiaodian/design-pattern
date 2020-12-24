package com.msxd.gof.Memento;

import com.msxd.gof.Factory.AbstractFactory.MAC;

/**
 * @author wjhk
 * @date 2020/12/24 17:35
 * 备忘录模式--备忘录
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
