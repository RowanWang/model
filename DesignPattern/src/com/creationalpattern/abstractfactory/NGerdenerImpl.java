package com.creationalpattern.abstractfactory;

/**
 * Created by szk on 2019/11/12.
 */
public class NGerdenerImpl implements Gerdener {
    public Fruit F() {
        return new NorthFruitImpl();
    }

    public Veggie V() {
        return new NorthVeggieImpl();
    }
}
