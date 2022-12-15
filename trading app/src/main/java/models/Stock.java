/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dghai
 */
public class Stock {
    
    private String name;
    
    private double shareprice;

    private String quantity;

    public Stock(String name, double shareprice, String quantity) {
        this.name = name;
        this.shareprice = shareprice;
        this.quantity = quantity;
    }
    
    
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getShareprice() {
        return shareprice;
    }

    public void setShareprice(double shareprice) {
        this.shareprice = shareprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\t" + shareprice + "\t" + quantity;
    }
    
}
