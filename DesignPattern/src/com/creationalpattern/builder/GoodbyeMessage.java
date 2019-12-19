package com.creationalpattern.builder;

/**
 * Created by szk on 2019/12/12.
 */
public class GoodbyeMessage extends AutoMessage {
    public GoodbyeMessage() {
        System.out.println("Entering Goodbye Message.");
    }

    public void sayGoodbye(){
        System.out.println("Goodbye.");
    }
}
