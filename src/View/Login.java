/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Exceptions.LoginException;
import Model.Pc;
import Model.Profile;
import gpubattle.DAO.GameDAO;
import gpubattle.DAO.PcDAO;
import gpubattle.DAO.ProfileDAO;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Images/logo.png")));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSingIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomeRegistro = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPasswordFieldRegistrar = new javax.swing.JPasswordField();
        jPasswordFieldEntrar = new javax.swing.JPasswordField();
        jLabelDeletar = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nome");

        jLabel2.setText("Senha");

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Mudar Senha");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jButtonSingIn.setText("Entrar");
        jButtonSingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSingInActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Entrar");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pc login1.png"))); // NOI18N

        jLabel6.setText("Nome");

        jTextFieldNomeRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeRegistroActionPerformed(evt);
            }
        });

        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabel8.setText("Senha");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Registrar");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pc login2.png"))); // NOI18N

        jPasswordFieldRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldRegistrarActionPerformed(evt);
            }
        });

        jPasswordFieldEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldEntrarActionPerformed(evt);
            }
        });

        jLabelDeletar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabelDeletar.setForeground(new java.awt.Color(51, 51, 255));
        jLabelDeletar.setText("Deletar Conta");
        jLabelDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeletarMouseClicked(evt);
            }
        });

        jComboBox1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel2)
                        .addComponent(jButtonSingIn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jPasswordFieldEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldNomeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel8)
                        .addComponent(jPasswordFieldRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDeletar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldNomeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDeletar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSingIn)
                            .addComponent(jButtonRegister))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSingInActionPerformed
        ProfileDAO profD = new ProfileDAO();
        String name = (String) jComboBox1.getSelectedItem();
        String password = jPasswordFieldEntrar.getText();
        Profile prof = new Profile(name, password);

        try {
            if (profD.checkProfile(prof)) {

                JOptionPane.showMessageDialog(null, " existe seu perfil");
                
                Home home = new Home();
                home.setVisible(true);
                this.setVisible(false);
            } else {
                throw new LoginException("Login ou senha incorretas!");
            }
        } catch (LoginException l1) {
            JOptionPane.showMessageDialog(null, l1.getMsg());
        }
    }//GEN-LAST:event_jButtonSingInActionPerformed

    private void jTextFieldNomeRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeRegistroActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        ProfileDAO profD = new ProfileDAO();

        String name = jTextFieldNomeRegistro.getText();
        String password = jPasswordFieldRegistrar.getText();

        jTextFieldNomeRegistro.setText("");
        jPasswordFieldRegistrar.setText("");

        Profile prof = new Profile(name, password);
        
        try {
            if (!profD.checkProfile(prof)) {
                
                profD.inserirProfile(prof);
                JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");

            } else {

                throw new LoginException("Login já existe");
            }
        } catch (LoginException l1) {
            JOptionPane.showMessageDialog(null, l1.getMsg());

        }

        // iNSERINDO PERFIL NOVO NA COMBOBOX       
        ProfileDAO pd = new ProfileDAO();
        ArrayList<String> profileList = new ArrayList<>();
        profileList = pd.SelectAllProfile();

        jComboBox1.removeAllItems(); // remove todos os items da combobox

        for (int i = 0; i < profileList.size(); i++) {                 
            jComboBox1.addItem(profileList.get(i));
        }

        

    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jPasswordFieldRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldRegistrarActionPerformed

    private void jPasswordFieldEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldEntrarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ChangePassword changePass = new ChangePassword();
        changePass.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabelDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeletarMouseClicked

        ProfileDAO profD = new ProfileDAO();

        String name = jTextFieldNomeRegistro.getText();
        String password = jPasswordFieldRegistrar.getText();
        jTextFieldNomeRegistro.setText("");
        jPasswordFieldRegistrar.setText("");
        Profile prof = new Profile(name, password);

        try {
            if (profD.checkProfile(prof)) {
                
                profD.deletarProfile(prof);
                JOptionPane.showMessageDialog(null, "Conta deletada com sucesso!");
            } else {

                throw new LoginException("Login ou senha incorretas!");
            }
        } catch (LoginException l1) {
            JOptionPane.showMessageDialog(null, l1.getMsg());
        }

    }//GEN-LAST:event_jLabelDeletarMouseClicked

    private void jComboBox1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox1AncestorAdded
        ProfileDAO pd = new ProfileDAO();
        ArrayList<String> profileList = pd.SelectAllProfile();

        jComboBox1.removeAll();

        for (int i = 0; i < profileList.size(); i++) {
            jComboBox1.addItem(profileList.get(i));
        }
    }//GEN-LAST:event_jComboBox1AncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonSingIn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDeletar;
    private javax.swing.JPasswordField jPasswordFieldEntrar;
    private javax.swing.JPasswordField jPasswordFieldRegistrar;
    private javax.swing.JTextField jTextFieldNomeRegistro;
    // End of variables declaration//GEN-END:variables

}
