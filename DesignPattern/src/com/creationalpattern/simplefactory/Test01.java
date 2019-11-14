package com.creationalpattern.simplefactory;

/**
 * Created by szk on 2019/11/11.
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            FruitGardener.Factory("apple1").harvest();
        } catch (BadFruitExecption badFruitExecption) {
            System.out.print(badFruitExecption.getMessage());
        }
    }
}
