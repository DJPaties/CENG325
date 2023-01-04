/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import models.User;

/**
 *
 * @author youss
 */
public class Controller {

    private FileAccess fa;

    public boolean addUser(User user) {
        ArrayList<User> allUsers = fa.readUsers();

        if (allUsers.contains(user)) {
            return false;
        }
        fa.writeToFile("Users.txt", user.toString());
        return true;
    }

    public boolean removeUser(User user) {
        ArrayList<User> allUsers = fa.readUsers();

        if (!allUsers.contains(user)) {
            return false;
        }

        allUsers.remove(user);
        fa.clearFile("Users.txt");

        for (int i = 0; i < allUsers.size(); i++) {
            fa.writeToFile("Users.txt", allUsers.get(i).toString());
        }
        return true;
    }

    public boolean modifyUserName(User user, String newName) {
        ArrayList<User> allUsers = fa.readUsers();

        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getName().equals(user.getName())) {
                allUsers.get(i).setName(newName);
                return true;
            }
        }
        return false;
    }
     
        public boolean modifyUserPassword(User user, String newPassword) {
        ArrayList<User> allUsers = fa.readUsers();

        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getName().equals(user.getName())) {
                allUsers.get(i).setPassword(newPassword);
                return true;
            }
        }
        return false;
    }
    

}
