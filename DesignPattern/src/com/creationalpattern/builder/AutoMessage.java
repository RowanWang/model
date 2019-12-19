package com.creationalpattern.builder;

import java.util.Date;

/**
 * Created by szk on 2019/12/12.
 *
 */
abstract public class AutoMessage {
    protected String subject = "";
    protected String body = "";
    protected String from = "";
    protected String to = "";
    protected Date sendDate = null;

    public AutoMessage (){}

    public void send(){
        System.out.println("该方法被调用");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
