/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import gpubattle.model.*;
import gpubattle.*;

/**
 *
 * @author bruno
 */
public abstract class Hardware {
    private String name; //GTX 3090
    private String brand; // Zotac, Asus, Evga
    private float Clock; 
    private float cost;
    private float memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getClock() {
        return Clock;
    }

    public void setClock(float Clock) {
        this.Clock = Clock;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return   "name=" + name + ", brand=" + brand ;
    }
    
    
    
    
}
