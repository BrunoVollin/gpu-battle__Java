/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import gpubattle.DAO.PcDAO;
import gpubattle.DAO.TestDAO;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class Interface {
    
    
    public void cleanTable(javax.swing.JTable table) {
         while (table.getModel().getRowCount() > 0) {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
    }
    
    public ArrayList<String> gamesSelected (
    javax.swing.JRadioButton jRadioButtonFarCry,
    javax.swing.JRadioButton jRadioButtonACOrigins,     
    javax.swing.JRadioButton jRadioGta   
    ) {
        ArrayList<String> gamesSelected = new ArrayList<>();
        
        if (jRadioButtonFarCry.isSelected()) {
            gamesSelected.add("Far Cry 5");
        }
        if (jRadioButtonACOrigins.isSelected()) {
            gamesSelected.add("Assassin´s creed: Origins");
        }
        if (jRadioGta.isSelected()) {
            gamesSelected.add("Gta 5");
        }
        
        return gamesSelected;      
    }
    
    public void setInfoInterface(
    ArrayList<String> gamesSelected,
    javax.swing.JTable jTable,
    javax.swing.JComboBox<String> jComboBoxPcInfo1,  
    javax.swing.JTextPane jTextPaneCostPerFrame,
    javax.swing.JTextPane jTextPaneGlogalFps,
    javax.swing.JTextArea jTextAreaInfoPc
    ) {
        PcDAO pd = new PcDAO();
        
        String namePc = (String) jComboBoxPcInfo1.getSelectedItem();
        
        DefaultTableModel dtmTest = (DefaultTableModel) jTable.getModel();
        TestDAO td = new TestDAO();
        
        int totalFps = 0;
        int fps = 0;
        for (String game : gamesSelected) { //ADICIONA AS LINHAS NA JtABLE
            fps = td.SelectTestFps( namePc + " on " + game);
            totalFps += fps;
            
            Object[] dados = {game, fps};
            dtmTest.addRow(dados);
        }
       
        System.out.println(totalFps + " " + pd.getCostForPc(namePc));
        
        float globalFps =  (float)totalFps / (float)gamesSelected.size();
        float costPc = (float)pd.getCostForPc(namePc);
        
        
        jTextPaneCostPerFrame.setText(new DecimalFormat("#,##0.00").format(costPc / globalFps));
        jTextPaneGlogalFps.setText(new DecimalFormat("#,##0.00").format(globalFps));
        
        jTextAreaInfoPc.setText(pd.SelectInfoPc(namePc));
        
       
                
        
    }
}
