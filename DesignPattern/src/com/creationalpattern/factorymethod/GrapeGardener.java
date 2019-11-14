package com.creationalpattern.factorymethod;

/**
 * Created by szk on 2019/11/12.
 */
public class GrapeGardener implements FruitGardener {
    @Override
    public Fruit Factory() {
        return new Grape();
    }
}
