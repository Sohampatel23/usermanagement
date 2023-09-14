package com.geekster.todoApp;


public class User {

    private Integer userId;
    private Integer phNumber;
    private String userName;
    private String uname;

    private String address;

    public User(Integer userId, Integer phNumber, String userName, String uname, String address ) {
        this.userId = userId;
        this.phNumber = phNumber;
        this.userName = userName;
        this.uname = uname;
        this.address = address;
    }

    public Integer getTodoId() {
        return userId;
    }

    public void setTodoId(Integer todoId) {
        this.userId = todoId;
    }

    public Integer getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(Integer phNumber) {
        this.phNumber = phNumber;
    }

    public String getTodoName() {
        return userName;
    }

    public void setTodoName(String todoName) {
        this.userName = todoName;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
