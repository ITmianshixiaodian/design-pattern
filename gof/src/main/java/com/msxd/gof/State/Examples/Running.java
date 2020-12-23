package com.msxd.gof.State.Examples;

/**
 * @author wjhk
 * @date 2020/12/23 17:05
 * 具体状态类--运行状态
 */
public class Running extends ThreadState{
    Running(){
        stateName="运行状态";
        System.out.println("当前状态处于：运行状态。");
    }

    public void suspend(ThreadContext hj){
        System.out.print("调用suspend()方法-->");
        if(stateName.equals("运行状态")){
            hj.setState(new Blocked());

        }else{
            System.out.println("当前线程状态不是运行状态，不能调用suspend()方法。");
        }
    }

    public  void stop(ThreadContext hj){
        System.out.print("调用stop()方法-->");
        if(stateName.equals("运行状态")){
            hj.setState(new Dead());
        }else{
            System.out.println("当前线程状态不是运行状态，不能调用stop()方法。");
        }
    }

}
