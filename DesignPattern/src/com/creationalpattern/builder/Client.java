package com.creationalpattern.builder;

/**
 * Created by szk on 2019/12/12.
 */
public class Client {
    private static Builder builder;
    private static Director director;
    public static void main (String[]args){
        builder = new WelcomeBuilder();
        director = new Director(builder);
        director.construct("11111","22222");
    }
}
