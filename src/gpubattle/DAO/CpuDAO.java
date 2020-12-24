/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import Model.Cpu;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class CpuDAO extends ConnectionDAO {

    boolean sucesso = false;

    public int getIdCpu(Cpu cpu) {
        int id = 0;
        connectToDB();
        String sql = "select * from Cpu;";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                id = rs.getInt("idCpu") + 1;

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
        return id;
    }
    
    public boolean inserirCpu(Cpu cpu) {
        connectToDB();
        String sql = "INSERT INTO Cpu "
                + "(idCpu, nameCpu, brandCpu, costCpu) "
                + "values(?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIdCpu(cpu));
            pst.setString(2, cpu.name);
            pst.setString(3, cpu.brand);
            pst.setFloat(4, cpu.cost);
            pst.execute();

            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;

        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }

        }
        return sucesso;

    }

    public boolean atualizarCpu(int id, Cpu cpu) {
        connectToDB();
        String sql = "UPDATE Cpu "
                + "SET nameCpu=?, brandCpu=?, costCpu=? "
                + "where idCpu= ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cpu.name);
            pst.setString(2, cpu.brand);
            pst.setFloat(3, cpu.cost);
            pst.setInt(4, id);
            pst.execute();

            sucesso = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;

    }

    public boolean deletarCpu(int id) {
        connectToDB();
        String sql = "DELETE FROM Cpu where idCpu=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    
    public void selectCpu() {
        
        connectToDB();
       
        String sql = "SELECT * FROM Cpu";
        
        try {
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            while (rs.next()) {
                
                String aux = rs.getString("nameCpu");
                
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    
                    System.out.println(""
                            + "name: " + rs.getString("nameCpu"));
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
       
    }

}
