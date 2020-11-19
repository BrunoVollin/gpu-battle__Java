/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Comparation {

    ArrayList<SetOfTests> sets;

    public Comparation(ArrayList<SetOfTests> sets) {
        this.sets = sets;
        showSet();
  


    }

    public String printV(double n1, double n2) {
        String msg = n1 > n2
                ? "\u001B[" + "31" + "m"
                + n1
                + "\u001B[" + "m"
                : "\u001B[" + "32" + "m"
                + n1
                + "\u001B[" + "m";

        return msg;
    }
    
    public String showSet() {
        String msg = "";
        for(SetOfTests set : sets) {
            msg += set.pc.gpu.getName() + " and " + set.pc.cpu.getName() + "\n";
        }
        return msg;
    }

}
