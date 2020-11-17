/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle;

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
        t1.game.add(game1);
        
        //TESTE.FPS
        t1.setFps(200);
        
        //TESTE.PC
        Pc pc = new Pc();
        
        //TESTE.PC.GPU
        Gpu gpu = new Gpu();
        
        gpu.setName("1080 ti");
        gpu.setBrand("NVIDEA");
        gpu.setClock("3.0");
        gpu.setCost(500f);
        gpu.setMemory("18gb");
        
        gpu.setMadeBy("ASUS");
        gpu.setvRam("8gb");
        pc.gpu = gpu;
        
        //TESTE.PC.CPU
        Cpu cpu = new Cpu();
        
        cpu.setName("i5 7400");
        cpu.setBrand("Intel");
        cpu.setClock("3.0");
        cpu.setCost(500f);
        cpu.setMemory("1gb");
        
        cpu.setCores("4 cores");
        cpu.setThreads("8 threads");
        pc.cpu = cpu;
        
        t1.pc = pc;
        
        
        
        
        
        
        
        
        
    }
    
}
