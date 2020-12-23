package com.msxd.gof.State.Examples;

/**
 * @author wjhk
 * @date 2020/12/23 17:11
 * 具体状态类--阻塞状态
 */
public class Blocked extends ThreadState {
    Blocked(){
        stateName ="阻塞状态";
        System.out.println("当前线程处于：阻塞状态。");
    }

    public void resume(ThreadContext hj){
        System.out.print("调用resume()方法-->");
        if(stateName.equals("阻塞状态")){
            hj.setState(new Runnable());

        }else{
            System.out.println("当前线程状态不是阻塞状态，不能调用resume()方法。");
        }
    }
}
