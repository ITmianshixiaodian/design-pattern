package com.msxd.gof.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjhk
 * @date 2020/12/22 14:30
 */
public class ConcreteMediator  extends Mediator{
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    @Override
    void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }

    }

    @Override
    void relay(Colleague cl) {
        for (Colleague ob:colleagues){
            if(ob.equals(cl)){
                ((Colleague)ob).receive();

            }
        }

    }
}
