/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpubattle.DAO;

import Model.Gpu;
import java.sql.SQLException;

/**
 *
 * @author davir
 */
public class GpuDAO extends ConnectionDAO {

    boolean sucesso = false;


    public int getIdGpu(Gpu gpu) {
        int id = 0;
        connectToDB();
        String sql = "select * from Gpu;";

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {

                id = rs.getInt("idGpu") + 1;

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

    public boolean inserirGpu(Gpu gpu) {
        connectToDB();
        String sql = "INSERT INTO Gpu "
                + "(idGpu, nameGpu, brandGpu, costGpu) "
                + "values(?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, getIdGpu(gpu));
            pst.setString(2, gpu.name);
            pst.setString(3, gpu.brand);
            pst.setFloat(4, gpu.cost);

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

    public boolean atualizarGpu(int id, Gpu gpu) {
        connectToDB();
        String sql = "UPDATE Gpu SET"
                + "  nameGpu=?,brandGpu=?,costGpu=?"
                + "  where idGpu=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, gpu.name);
            pst.setString(2, gpu.brand);
            pst.setFloat(3, gpu.cost);
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

    public boolean deletarGpu(int id) {
        connectToDB();
        String sql = "DELETE FROM Gpu where idGpu=?";

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

}
