package com.example.cheesemvc.models;

public class User {
    private String username;
    private String password;
    private String email;

    public User() {
        this.username = "";
        this.password = "";
        this.email = "";
    }

    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getEmail() {
        return this.email;
    }
}
