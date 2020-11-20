/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.model;

import gpubattle.*;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Comparation {

    SetTests set1, set2;

    public Comparation(SetTests set1, SetTests set2) {
        this.set1 = set1;
        this.set2 = set2;
        System.out.println(showSet());

    }

    public String getColor(double n1, double n2) {
        String msg = "";
        if (n1 == n2) {
            msg += n1;
        } else if (n1 > n2) {
            msg += "\u001B[" + "32" + "m" + n1 + "\u001B[" + "m";
        } else {
            msg += "\u001B[" + "31" + "m" + n1 + "\u001B[" + "m";
        }

        return msg;
    }

    public String showSet() {

        String msg = "PC 1:"
                + set1.pc.gpu.getName()
                + " and "
                + set1.pc.cpu.getName() + "\n"
                + "   GPU: " + set1.pc.gpu.toString()
                + ", Clock=" + getColor(set1.pc.gpu.getClock(), set2.pc.gpu.getClock())
                + ", cost=" + getColor(set2.pc.gpu.getCost(), set1.pc.gpu.getCost())
                + ", memory=" + getColor(set1.pc.gpu.getMemory(), set2.pc.gpu.getMemory())
                + ", vRam=" + getColor(set1.pc.gpu.getvRam(), set2.pc.gpu.getvRam()) + "\n"
                + "   CPU: " + set2.pc.cpu.toString() + "\n"
                + "   FPS: " + set2.getFps() + "\n\n"
                + "PC 2:"
                + set2.pc.gpu.getName()
                + " and "
                + set2.pc.cpu.getName() + "\n"
                + "   GPU: " + set2.pc.gpu.toString()
                + ", Clock=" + getColor(set2.pc.gpu.getClock(), set1.pc.gpu.getClock())
                + ", cost=" + set2.pc.gpu.getCost()
                + ", memory=" + getColor(set2.pc.gpu.getMemory(), set1.pc.gpu.getMemory())
                + ", vRam=" + getColor(set2.pc.gpu.getvRam(), set1.pc.gpu.getvRam()) + "\n"
                + "   CPU: " + set2.pc.cpu.toString() + "\n"
                + "   FPS: " + set2.getFps();
        ;

        return msg;
    }

}
