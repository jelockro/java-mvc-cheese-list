package com.example.cheesemvc.models;

import java.util.ArrayList;

public class UserData {
    static ArrayList<User> users= new ArrayList<>();
    // get all
    public static ArrayList<User> getAll() {
        return users;
    }
    // add
    public static void add(User newUser){
        users.add(newUser);
    }
    // remove
    public static void remove(int id) {
        User userToRemove = getByID(id);
        users.remove(userToRemove);
    }
    // getbyID
    public static User getByID(int id) {
        User theUser = null;

        for (User candidateUser: users) {
            if (candidateUser.getUserID() == id) {
                theUser = candidateUser;
            }
        }
        return theUser;
    }
    public static void edit(User editUser) {
        remove(editUser.getUserID());
        add(editUser);

    }
}
