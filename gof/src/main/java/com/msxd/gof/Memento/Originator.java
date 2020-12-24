package com.msxd.gof.Memento;

/**
 * @author wjhk
 * @date 2020/12/24 17:37
 * 备忘录模式--发起人
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento m){
        this.setState(m.getState());
    }
}
