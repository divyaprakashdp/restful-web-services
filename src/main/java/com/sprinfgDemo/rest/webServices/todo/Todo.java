package com.sprinfgDemo.rest.webServices.todo;

import java.util.Date;

public class Todo {
    private int id;
    private String username;
    private String description;
    private Date ETA;
    private boolean isDone;

    public Todo(int id, String username, String description, Date ETA, boolean isDone) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.ETA = ETA;
        this.isDone = isDone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return ETA;
    }

    public void setTargetDate(Date ETA) {
        this.ETA = ETA;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
