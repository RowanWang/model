package com.creationalpattern.singleton;

/**
 * Created by szk on 2019/11/14.
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    synchronized public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}

