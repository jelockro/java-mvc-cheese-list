package com.example.cheesemvc.models;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cheese {
    @NotNull
    @Size(min=3, max=15)
    private String name;
    @NotNull
    @Size(min=1, message="Description must not be empty.")
    private String description;
    private int cheeseID;
    private static int nextID = 1;



    private CheeseType type;
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
    public CheeseType getType() {
        return type;
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


    public void setType(CheeseType type) {
        this.type = type;
    }

}