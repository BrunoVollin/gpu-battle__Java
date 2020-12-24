/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import gpubattle.*;

/**
 *
 * @author bruno
 */
public class Pc {

    public float cost;
    public Cpu cpu = new Cpu();
    public Gpu gpu = new Gpu();
    public String name;

    public int idPc = 0;
    

    public Pc(Cpu cpu, Gpu gpu) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.cost = cpu.cost + gpu.cost;
        this.name = gpu.name + ", " + cpu.name;
    }

    public Pc() {
        
    }

    

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

}
