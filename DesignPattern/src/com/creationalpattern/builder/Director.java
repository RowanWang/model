package com.creationalpattern.builder;

/**
 * Created by szk on 2019/12/12.
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String toAddress,String fromAddress){
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildFrom(fromAddress);
        this.builder.buildTo(toAddress);
        this.builder.buildSendDate();
        this.builder.sendMessage();

    }
}
