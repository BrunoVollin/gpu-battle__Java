/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle;

import gpubattle.DAO.CpuDAO;
import gpubattle.DAO.GpuDAO;
import gpubattle.DAO.PcDAO;
import gpubattle.DAO.TestDAO;
import Model.Cpu;
import Model.Game;
import Model.Gpu;
import Model.Pc;
import Model.Test;
import View.Login;
import gpubattle.DAO.GameDAO;
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

        /*
        -----------------------------------------------------------------------
        ----------------------------- TESTE 1 --------------------------------- 
        -----------------------------------------------------------------------
         */
 /*
        -----------------------------------------------------------------------
        ----------------------------- TESTE 2 --------------------------------- 
        -----------------------------------------------------------------------
         */
 /*
        -----------------------------------------------------------------------
        ----------------------------- COMPARAÇÃO 1 ----------------------------
        -----------------------------------------------------------------------
         */
 /*
        -----------------------------------------------------------------------
        -------------------------- INSERINDO NO BD ----------------------------
        -----------------------------------------------------------------------
         */
         /*
        //----------Gpu----------//
        Gpu gpu1 = new Gpu();
        gpu1.name = "1060";
        gpu1.brand = "Nvidea";
        gpu1.cost = 600;

        //----------Cpu----------//
        Cpu cpu1 = new Cpu();
        cpu1.name = "i5 9400";
        cpu1.brand = "Intel";
        cpu1.cost = 600;

        //----------Pc----------//
        Pc pc1 = new Pc(cpu1, gpu1);

        //----------Game----------//
        Game game1 = new Game();
        game1.name = "Mine Craft";
        game1.nameDeveloper = "Ubsoft";
        game1.cityDeveloper = "Montreuil, Ilha de França.";

        //----------Test----------//
        Test t1 = new Test();
        t1.fps = 100;
        t1.game = game1;
        t1.pc = pc1;

        //--------BatteryTests-------//
        ArrayList<Test> tests = new ArrayList<>();
        BatteryTests bt = new BatteryTests(tests, pc1);

        GameDAO gameDAO = new GameDAO();
        CpuDAO cpuDAO = new CpuDAO();
        GpuDAO gpuDAO = new GpuDAO();
        PcDAO pcDAO = new PcDAO();
        TestDAO testDAO = new TestDAO();

        cpuDAO.inserirCpu(cpu1);
        gpuDAO.inserirGpu(gpu1);
        pcDAO.inserirPc(pc1);
        gameDAO.inserirGame(game1);
        testDAO.inserirTest(t1);
        
        //System.out.println(testDAO.getIdGameForTest(test1));
//        System.out.println(pcDAO.getIdCpuForPc(pc1));
//        ArrayList<Pc> PcList = pcDAO.SelectAllPc();
//        for (int i = 0; i < PcList.size(); i++) {
//            System.out.println(PcList.get(i).name);
//        }

    
         */
       Login login = new Login();
       login.setVisible(true);
    }

}
