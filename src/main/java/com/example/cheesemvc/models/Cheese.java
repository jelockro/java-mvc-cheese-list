package com.example.cheesemvc.models;

public class Cheese {
    private String name;
    private String description;

    protected Cheese(String name, String description){
        this.name = name;
        this.description = description;
    }

    protected String getName(){
        return(this.name);
    }
    protected String getDescription(){
        return(this.description);
    }
}
