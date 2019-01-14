package com.example.cheesemvc.models;

public class Cheese {
    private String name;
    private String description;
    private int cheeseID;
    private static int nextID = 1;


    public Cheese() {
        this.cheeseID = this.nextID;
        this.nextID ++;
    }

    public Cheese(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return (this.name);
    }
    public String getDescription() {
        return (this.description);
    }
    public int getCheeseID() {
        return cheeseID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCheeseID(int cheeseID) {
        this.cheeseID = cheeseID;
    }

}