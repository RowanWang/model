package com.creationalpattern.abstractfactory;

/**
 * Created by szk on 2019/11/12.
 */
public class NorthFruitImpl implements Fruit {
    @Override
    public void harvest() {
        System.out.println("NorthFruitImpl has been harvested");
    }

    public void test (){
        System.out.println("test");
    }
}
