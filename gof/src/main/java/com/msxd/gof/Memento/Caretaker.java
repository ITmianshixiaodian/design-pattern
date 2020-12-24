package com.msxd.gof.Memento;

/**
 * @author wjhk
 * @date 2020/12/24 17:39
 * 备忘录模式--管理者
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento){
        this.memento=memento;
    }

    public Memento getMemento(){
        return memento;
    }
}
