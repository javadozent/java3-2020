package com.example.hallo22.model;

import java.io.Serializable;

public class Message implements Serializable, Cloneable {

    private int id;
    private String msg;

    public Message(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public Message() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
