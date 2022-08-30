/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import Model.Pc;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author davir
 */
public class PcDAO extends ConnectionDAO {

    boolean sucesso = false;


    public ArrayList<Pc> SelectAllPc() {
        
        ArrayList<Pc> PcList = new ArrayList<>();

        connectToDB();

        String sql = "SELECT * FROM Pc";
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                Pc pcAux = new Pc();

                pcAux.name = rs.getString("namePc");
                pcAux.cost = rs.getFloat("costPc");
                pcAux.cpu.name = rs.getString("Cpu_nameCpu");
                pcAux.gpu.name = rs.getString("Gpu_nameGpu");

                PcList.add(pcAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return PcList;
    }

    public int getCostForPc(String namePc) {

        int cost = 0;
        connectToDB();
        String sql = "select costPc from Pc where namePc = '" + namePc + "';";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                cost = rs.getInt("costPc");
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return cost;

    }

    public String SelectInfoPc(String name) {
        String info = null;
        connectToDB();
        String sql = "select * from pc, cpu, gpu "
                + "where namePc = '" + name + "' and "
                + "Cpu_nameCpu = nameCpu and Gpu_nameGpu = nameGpu; ";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                info = "Nome do Pc: " + rs.getString("namePc") + "\n"
                        + "         Gpu: " + rs.getString("nameGpu") + "\n"
                        + "                             Brand: " + rs.getString("brandGpu") + "\n"
                        + "                             Cost: " + rs.getString("costGpu") + "\n"
                        + "         Cpu: " + rs.getString("nameCpu") + "\n"
                        + "                             Brand: " + rs.getString("brandCpu") + "\n"
                        + "                             Cost: " + rs.getString("costCpu") + "\n"
                        + "Custo Total: " + rs.getString("costPc")
                        ;

            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        System.out.println(info);
        return info;
    }

}
