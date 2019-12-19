package com.creationalpattern.tproxy;

/**
 * Created by szk on 2019/12/18.
 */
public class HelloImplement implements Ihello {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello"+name);
    }

    @Override
    public void sayGoogbye(String name) {
        System.out.println(name+"GoodBye !");
    }
}
