/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author youss
 */
public class User {
    private String name;
    private int id;
    private String password;
    static private int totalUsers;

    public User(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        totalUsers++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    @Override
    public String toString() {
        return   name + "\t" + id + "\t"+ password;
    }

    
    
    
}
