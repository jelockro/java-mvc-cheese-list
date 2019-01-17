package com.example.cheesemvc.models;

import java.util.ArrayList;

public class CheeseData {
    static ArrayList<Cheese> cheeses= new ArrayList<>();

    // get all
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }
    // add
    public static void add(Cheese newCheese){
        cheeses.add(newCheese);
    }
    // remove
    public static void remove(int id) {
        Cheese cheeseToRemove = getByID(id);
        cheeses.remove(cheeseToRemove);
    }
    // getbyID
    public static Cheese getByID(int id) {
        Cheese theCheese = null;

        for (Cheese candidateCheese: cheeses) {
            if (candidateCheese.getCheeseID() == id) {
                theCheese = candidateCheese;
            }
        }
        return theCheese;
    }
    public static void edit(Cheese editCheese) {
        remove(editCheese.getCheeseID());
        add(editCheese);

    }

}
