/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import Model.Cpu;
import Model.Game;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author davir
 */
public class GameDAO extends ConnectionDAO {

    boolean sucesso = false;

    
    
    public String getInfoGame(String name) {
        
        String info = null;
        GameHasPcDAO ghpd = new GameHasPcDAO();
        connectToDB();
        String sql = "select * from game, developer where nameGame = '" + name + "' and nameGame = Game_nameGame;";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                info = "Nome do Jogo: " + rs.getString("nameGame") + "\n" 
                        + "Desenvolvedora: " + rs.getString("name") + "\n"
                        + "Sede: " + rs.getString("city") + "\n"
                        + ghpd.selectMoreThan60(name);

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
