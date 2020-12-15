package com.msxd.gof.Composite.Safe;

import java.util.ArrayList;

public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<>();

    public void add(Component c){
        children.add(c);
    }

    public void remove(Component c){
        children.remove(c);
    }

    @Override
    public void operation() {
        for (Component c:children){
            c.operation();
        }

    }
}
