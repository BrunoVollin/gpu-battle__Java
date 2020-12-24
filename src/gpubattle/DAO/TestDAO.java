/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import Model.Cpu;
import Model.Pc;
import Model.Test;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class TestDAO extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public int getIdTest(Test test) {
        int id = 0;
        connectToDB();
        String sql = "select * from Test;";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                id = rs.getInt("idTest") + 1;

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
    
    public int getIdGameForTest(Test test) {
        String nameGame = test.game.name;
        int id = 0;
        connectToDB();
        String sql = "select idJogo from Game where namegame = '" + nameGame + "';";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                id = rs.getInt("idJogo");

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
    
    public int getIdPcForTest(Test test) {
        String namePc = test.pc.name;
        System.out.println(namePc);
        int id = 0;
        connectToDB();
        String sql = "select idPc from Pc where namePc = '" + namePc + "';";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                id = rs.getInt("idPc");

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
    
    public boolean inserirTest(Test test) {
        connectToDB();
        String sql = "INSERT INTO Test "
                + "(idTest, fps, Game_idJogo, Pc_idPc, nameTest) "
                + "values(?, ?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIdTest(test));
            pst.setInt(2, test.getFps());
            pst.setInt(3,getIdGameForTest(test));
            pst.setInt(4,getIdPcForTest(test));
            pst.setString(5, 
                    test.pc.gpu.name + ", "
                    + test.pc.cpu.name + " em "
                    + test.game.name                                         
            );
            
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
    
    public boolean atualizarCpu(int id, Test test) {
        connectToDB();
        String sql = "UPDATE Test "
                + "SET idTest=?, fps=?, idJogo=?, idPc=?, nameTest=?"
                + "where idTest= ?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, test.idTest);
            pst.setInt(2, test.getFps());
            pst.setInt(3,test.game.idJogo);
            pst.setInt(4,test.pc.idPc);
            pst.setString(5,test.name);
            
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
        String sql = "DELETE FROM Test where idTest=?";

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
    
    public int SelectTestFps(String testName) {
        int fps = 0;
        connectToDB();
        
        String sql = "select * from test "
                + "where nametest = '" + testName + "';";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {           
                fps = rs.getInt("fps"); 
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return fps;
    }

}
