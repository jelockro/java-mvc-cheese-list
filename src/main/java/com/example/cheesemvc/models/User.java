package com.example.cheesemvc.models;

public class User {


    private String username;



    private String password;



    private String email;
    private int userID;
    private static int nextID = 1;

    public User() {
        this.userID = this.nextID;
        this.nextID ++;
    }

    public User(String username, String password, String email){
        this();
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    public void setEmail(java.lang.String email) {
        this.email = email;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getEmail() {
        return this.email;
    }
    public int getUserID() {
        return userID;
    }
}
