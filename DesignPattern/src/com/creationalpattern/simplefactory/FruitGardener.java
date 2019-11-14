package com.creationalpattern.simplefactory;

/**
 * Created by szk on 2019/11/11.
 */
public class FruitGardener {

    public static Fruit Factory(String which) throws BadFruitExecption {
        if(which.equalsIgnoreCase("apple")){
            return new Apple();
        }
        else if (which.equalsIgnoreCase("grape")){
            return  new Grape();
        }else  if (which.equalsIgnoreCase("strawberry")){
            return new Strawberry();
        }else {
            throw new BadFruitExecption("Bad Fruit Request");
        }
    }
}
