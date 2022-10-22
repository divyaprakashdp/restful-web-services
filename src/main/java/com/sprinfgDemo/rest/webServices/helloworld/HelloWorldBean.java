package com.sprinfgDemo.rest.webServices.helloworld;

public class HelloWorldBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public  HelloWorldBean(String message){
        this.message = message;
    }
}
