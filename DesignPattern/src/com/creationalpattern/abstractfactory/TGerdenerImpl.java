package com.creationalpattern.abstractfactory;

/**
 * Created by szk on 2019/11/12.
 */
public class TGerdenerImpl implements Gerdener {
    public Fruit F() {
        return new TropicalFruitImpl();
    }

    public Veggie V() {
        return new TropicalVeggieImpl();
    }
}
