package com.creationalpattern.builder;

/**
 * Created by szk on 2019/12/12.
 */
public class WelcomeBuilder extends Builder {
    private final static String subject = "Welcome to XXX.";

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject(subject);
    }

    @Override
    public void buildBody() {
        String body = "Congratulations for making the right choice.";
        msg.setBody(body);
    }

    public void sendMessage(){
        msg.send();
    }
}
