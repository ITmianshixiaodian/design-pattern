package com.msxd.gof.ChainOfResponsibility;

/**
 * @author wjhk
 * @date 2020/12/23 14:20
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equals("two")){
            System.out.println("具体处理者2负责处理该请求！");

        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
