package com.example.cheesemvc.models;

public class Cheese {
    private String name;
    private String description;

    public Cheese() {
        this.name = "";
        this.description = "";
    }

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return (this.name);
    }

    public String getDescription() {
        return (this.description);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}