package com.creationalpattern.builder;

import java.util.Date;

/**
 * Created by szk on 2019/12/12.
 */
abstract public class Builder {

    protected AutoMessage msg;

    public Builder(){

    }

    /*主题零件的构建方法*/
    public  abstract void buildSubject();
    /*内容零件的构建方法*/
    public abstract  void buildBody();

    public void buildFrom(String from){
        msg.setFrom(from);
    }

    public void buildTo (String to){
        msg.setTo(to);
    }

    public void buildSendDate(){
        msg.setSendDate(new Date());
    }

    public void sendMessage(){
        msg.send();
    }
}
