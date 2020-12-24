/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import Model.Game;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class GameHasPcDAO  extends ConnectionDAO{
    
    boolean sucesso = false;
    
    public String selectMoreThan60 (String nameGame ) {
        String msg = "\n" + "Pcs com mais que 60fps em " + nameGame + ".\n";
        connectToDB();

        String sql = "select * from pc_has_game where Game_nameGame = '" + nameGame + "';";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
                msg += "    " + rs.getString("PC_namePc") + "\n";
                
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
        return msg;
    }
}
