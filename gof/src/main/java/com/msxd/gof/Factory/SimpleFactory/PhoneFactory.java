package com.msxd.gof.Factory.SimpleFactory;

/**
 * @author wjhk
 * @date 2020/12/18 16:59
 */
public class PhoneFactory {
    public Phone makePhone(String phoneType){
        if(phoneType.equals("MiPhone")){
            return new MiPhone();
        }else if(phoneType.equals("IPhone")){
            return  new IPhone();
        }else if(phoneType.equals("HUAWEIPhone")){
            return new HUAWEIPhone();
        }
        return null;
    }
}
