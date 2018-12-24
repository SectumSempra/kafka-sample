package com.be.kafkasample.kafkastream;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Greetings {

    private String message;
    private long time;

    public Greetings() {
    }

    public Greetings(String message, long time) {
        super();
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
