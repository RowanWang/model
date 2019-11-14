package com.creationalpattern.singleton;

/**
 * Created by szk on 2019/11/14.
 */
public class Singleton {

    private static final Singleton singletonInstance = new Singleton ();

    private Singleton() {
    }

    public static Singleton singletonI(){
        return  singletonInstance;
    }
}
