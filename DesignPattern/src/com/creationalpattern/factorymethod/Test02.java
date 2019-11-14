package com.creationalpattern.factorymethod;

/**
 * Created by szk on 2019/11/12.
 */
public class Test02 {
    private static Fruit F1;
    private static FruitGardener FG1;

    public static void main(String[] args) {
        FG1= new AppleGardener();
        F1 = FG1.Factory();
        F1.plant();
    }
}
