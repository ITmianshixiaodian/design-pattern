package com.msxd.gof.State.Examples;

/**
 * @author wjhk
 * @date 2020/12/23 17:31
 */
public class Test {
    public static void main(String[] args) {
        ThreadContext hj = new ThreadContext();
        hj.start();
        hj.getCPU();
        hj.suspend();
        hj.resume();
        hj.getCPU();
        hj.stop();

    }
}
