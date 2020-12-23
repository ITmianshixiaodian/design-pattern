package com.msxd.gof.ChainOfResponsibility;

/**
 * @author wjhk
 * @date 2020/12/23 14:15
 */
public class ConcreteHandler1  extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equals("one")){
            System.out.println("具体处理者1负责处理该请求！");
        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没人处理该请求！");
            }
        }
    }
}
