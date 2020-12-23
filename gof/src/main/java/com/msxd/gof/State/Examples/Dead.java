package com.msxd.gof.State.Examples;

/**
 * @author wjhk
 * @date 2020/12/23 17:15
 * 具体状态类--死亡状态
 */
public class Dead extends ThreadState{
    Dead(){
        stateName="死亡状态";
        System.out.println("当前状态处于：死亡状态");
    }
}
