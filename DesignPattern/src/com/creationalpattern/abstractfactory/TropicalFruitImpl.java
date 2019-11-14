package com.creationalpattern.abstractfactory;

/**
 * Created by szk on 2019/11/12.
 */
public class TropicalFruitImpl implements Fruit {
    @Override
    public void harvest() {
        System.out.println("TropicalFruitImpl has been harvested");
    }
}
