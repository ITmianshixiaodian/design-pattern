package com.msxd.gof.Factory.SimpleFactory;

/**
 * @author wjhk
 * @date 2020/12/18 17:02
 */
public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory =new PhoneFactory();
        MiPhone miPhone= (MiPhone)phoneFactory.makePhone("MiPhone");
        IPhone iPhone= (IPhone)phoneFactory.makePhone("IPhone");
        HUAWEIPhone huaweiPhone = (HUAWEIPhone)phoneFactory.makePhone("HUAWEIPhone");

    }
}
