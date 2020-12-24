/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import Model.Cpu;
import Model.Pc;
import Model.Profile;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class ProfileDAO extends ConnectionDAO {

    boolean sucesso = false;

    public boolean inserirProfile(Profile profile) {
        connectToDB();
        String sql = "INSERT INTO Profile "
                + "(Login, password) "
                + "values( ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, profile.getName());
            pst.setString(2, profile.getPassword());

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

    public boolean checkProfile(Profile profile) {
        boolean check = false;
        connectToDB();
        String sql = "select * from Profile where "
                + " Login = '" + profile.getName() + "' "
                + " and Password = '" + profile.getPassword() + "' ;";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                check = true;
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
        return check;
    }

    public boolean atualizarProfile(Profile prof, String newPass) {
        connectToDB();
        String sql = "UPDATE Profile SET password=? where Login=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, newPass);

            pst.setString(2, prof.getName());

            System.out.println(prof.getName());
            System.out.println(prof.getPassword());
            System.out.println(newPass);

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
    
    public boolean deletarProfile(Profile profile) {
        connectToDB();
        String sql = "DELETE from profile where login = '" + profile.getName() + "' and password = " + profile.getPassword() +";";

        try {
            pst = con.prepareStatement(sql);
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
    
    public ArrayList<String> SelectAllProfile() {
        ArrayList<String> ProfileList = new ArrayList<>();
        String aux;
        
        connectToDB();

        String sql = "SELECT Login FROM profile";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                

                aux = rs.getString("login");
                

                ProfileList.add(aux);
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
        return ProfileList;
    }

    
}
