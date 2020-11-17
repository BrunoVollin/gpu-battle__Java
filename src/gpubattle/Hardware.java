/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle;

/**
 *
 * @author bruno
 */
public abstract class Hardware {
    private String name; //GTX 3090
    private String brand; // Zotac, Asus, Evga
    private String Clock; 
    private float cost;
    private String memory;

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

    public String getClock() {
        return Clock;
    }

    public void setClock(String Clock) {
        this.Clock = Clock;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    
    
    
}
