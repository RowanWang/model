package com.creationalpattern.factorymethod;

/**
 * Created by szk on 2019/11/12.
 */
public class Grape implements Fruit {
    //    是否有籽
    private boolean seedless;

    @Override
    public void grow() {
        log("Grape is growing.");
    }

    @Override
    public void harvest() {
        log("Grape has been harvested.");
    }

    @Override
    public void plant() {
        log("Grape has been planted.");
    }


    public static void log(String msg) {
        System.out.println(msg);
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    public boolean isSeedless() {
        return seedless;
    }
}
