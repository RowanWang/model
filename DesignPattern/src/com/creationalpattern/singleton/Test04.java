package com.creationalpattern.singleton;

/**
 * Created by szk on 2019/11/14.
 * --登记模式未写
 */
public class Test04 {
    public static void main(String[] args) {
        Singleton t1 = Singleton.singletonI();
        Singleton t2 = Singleton.singletonI();
        System.out.println(t1.equals(t2));
    }
}
