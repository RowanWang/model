package com.creationalpattern.factorymethod;

/**
 * Created by szk on 2019/11/12.
 */
public class Apple implements Fruit {
    //树龄
    private int treeAge;

    @Override
    public void grow() {
        log("apple is growing.");
    }

    @Override
    public void harvest() {
        log("apple has been harvested.");
    }

    @Override
    public void plant() {
        log("apple has been planted.");
    }


    public static void log(String msg) {
        System.out.println(msg);
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
