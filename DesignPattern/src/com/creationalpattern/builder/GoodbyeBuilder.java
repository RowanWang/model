package com.creationalpattern.builder;

/**
 * Created by szk on 2019/12/12.
 */
public class GoodbyeBuilder extends Builder {

    public final static String subject = "Think for you being with us.";

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject(subject);
    }

    @Override
    public void buildBody() {
        String body = "Oop! You have chose to leave";
        msg.setBody(body);
    }

    public void send(){
        msg.send();
    }
}
