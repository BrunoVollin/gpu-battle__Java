/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle;

import gpubattle.model.Comparation;
import gpubattle.model.Cpu;
import gpubattle.model.Game;
import gpubattle.model.Gpu;
import gpubattle.model.Pc;
import gpubattle.model.SetTests;
import gpubattle.model.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author bruno
 */
public class GpuBattle {

    /**
     * @param args the command line arguments
     */     
    public static void main(String[] args) {
        
        Test t1 = new Test();
        
        //TEST.GAME
        Game game1 = new Game();
        game1.setName("MineCraft");
        game1.setDeveloper("Mojang");
        t1.game = game1;
        
        //TESTE.FPS
        t1.setFps(200);
        
        //TESTE.PC
        Pc pc1 = new Pc();
        
        //TESTE.PC.GPU
        Gpu gpu1 = new Gpu();
        
        gpu1.setName("1080 ti");
        gpu1.setBrand("NVIDEA");
        gpu1.setClock(3.0f);
        gpu1.setCost(500f);
        gpu1.setMemory(18);
        
        gpu1.setMadeBy("ASUS");
        gpu1.setvRam(8f);
        pc1.gpu = gpu1;
        
        //TESTE.PC.CPU
        Cpu cpu1 = new Cpu();
        
        cpu1.setName("i5 7400");
        cpu1.setBrand("Intel");
        cpu1.setClock(3.0f);
        cpu1.setCost(500f);
        cpu1.setMemory(1);
        
        cpu1.setCores(4);
        cpu1.setThreads(8);
        pc1.cpu = cpu1;
        
        
        t1.setFps(100);
        
        //BATERIA
        ArrayList<Test> tests = new ArrayList<Test>();
        tests.add(t1);
        SetTests set1 = new SetTests(tests, pc1);
        
        
        //-----------------PC2-------------------//
        
        Test t2 = new Test();
        
        //TEST.GAME
        Game game2 = new Game();
        game2.setName("MineCraft");
        game2.setDeveloper("Mojang");
        t2.game = game2;
        
        //TESTE.FPS
        t2.setFps(200);
        
        //TESTE.PC
        Pc pc2 = new Pc();
        
        //TESTE.PC.GPU
        Gpu gpu2 = new Gpu();
        
        gpu2.setName("1080 ti");
        gpu2.setBrand("NVIDEA");
        gpu2.setClock(3.5f);
        gpu2.setCost(400f);
        gpu2.setMemory(11);
        
        gpu2.setMadeBy("ASUS");
        gpu2.setvRam(20f);
        pc2.gpu = gpu2;
        
        //TESTE.PC.CPU
        Cpu cpu2 = new Cpu();
        
        cpu2.setName("i5 7400");
        cpu2.setBrand("Intel");
        cpu2.setClock(4.0f);
        cpu2.setCost(450f);
        cpu2.setMemory(22);
        
        cpu2.setCores(3);
        cpu2.setThreads(6);
        pc2.cpu = cpu2;
        
        
        t2.setFps(200);
        
        //BATERIA
        ArrayList<Test> tests2 = new ArrayList<Test>();
        tests2.add(t2);
        SetTests set2 = new SetTests(tests, pc2);
        
        
        //COMPARATION
        
        Comparation comp = new Comparation(set1, set2);
        
        
        
   
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
