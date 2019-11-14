package com.creationalpattern.abstractfactory;

import java.util.regex.Pattern;

/**
 * Created by szk on 2019/11/12.
 * 接口中未定义方法无法直接调用
 */
public class Test03 {
    private static Fruit fruit;
    private static Veggie veggie;
    private static Gerdener gerdener;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        gerdener = new NGerdenerImpl();
/*        fruit = (Fruit)gerdener.V();
        fruit.test();*/
        System.out.println(gerdener.F().getClass().getMethods().toString());
    }
}
