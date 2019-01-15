package com.example.cheesemvc.models;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cheese {
    @NotNull
    @Size(min=3, max=15)
    private String name;
    @NotNull
    @Size(min=1)
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