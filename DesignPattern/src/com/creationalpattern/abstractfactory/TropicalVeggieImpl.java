package com.creationalpattern.abstractfactory;

/**
 * Created by szk on 2019/11/12.
 */
public class TropicalVeggieImpl implements Veggie {
    @Override
    public void harvest() {
        System.out.println("TropicalVeggieImpl has been harvested");
    }
}
