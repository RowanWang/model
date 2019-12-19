package com.creationalpattern.tproxy;

/**
 * Created by szk on 2019/12/18.
 */
public class Test {
    static public void main(String[] arg) {

        DynaProxyHello helloproxy = new DynaProxyHello();

        HelloImplement hello = new HelloImplement();

        Ihello ihello = (Ihello) helloproxy.bind(hello);

        ihello.sayHello("Jerry");

    }
}
