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
public class Gpu extends Hardware{
    private String madeBy; //Nvidea, AMD
    private float vRam; // Nvidea

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public float getvRam() {
        return vRam;
    }

    public void setvRam(float vRam) {
        this.vRam = vRam;
    }
    
    
 
}
