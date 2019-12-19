package com.creationalpattern.builder;

/**
 * Created by szk on 2019/12/12.
 */
public class WelcomeMessage extends AutoMessage {
    public WelcomeMessage() {
        System.out.println("Entering Welcome Message.");
    }

    public void sayWelcome(){
        System.out.println("Welcome.");
    }
}
