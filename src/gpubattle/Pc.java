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
public class Pc {
    private float cost;
    Cpu cpu = new Cpu();
    Gpu gpu = new Gpu();   

    public Pc() {
        this.cost = cpu.getCost() + gpu.getCost();
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
}