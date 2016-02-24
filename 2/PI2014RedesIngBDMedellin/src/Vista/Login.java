/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Modelo.Client;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AlvaroAlexander
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public Client client;
        
        private File f;
    private BufferedImage image;
    
          public final void imagen(String archivo) 
	{
            try 
            {
                f = new File(archivo);
                image = ImageIO.read(f);
            } 
            catch (IOException ie) 
            {
                System.out.println("Error: " + ie.getMessage() + " " + f.getName());
            }
	}
    
    public Login() {
        initComponents();
        client = new Client();
                imagen("imagenes\\logo.png");
        jLabel1.setIcon(new ImageIcon(f.getAbsolutePath()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_user = new javax.swing.JLabel();
        jLabel_pass = new javax.swing.JLabel();
        jButton_conex = new javax.swing.JButton();
        jTextField_user = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_user.setText("Usuario:");

        jLabel_pass.setText("Contraseña:");

        jButton_conex.setText("Iniciar Sesion");
        jButton_conex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_conexMouseClicked(evt);
            }
        });
        jButton_conex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_conexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton_conex))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_user)
                            .addComponent(jLabel_pass))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_user, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jPasswordField_pass))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_user))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_pass)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButton_conex)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_conexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_conexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_conexActionPerformed

    
    
    
    
    private void jButton_conexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_conexMouseClicked
        // TODO add your handling code here:
        
        
        String p = new String(jPasswordField_pass.getPassword()).trim();
        String tipoU = client.connect(jTextField_user.getText().trim(), new String(jPasswordField_pass.getPassword()).trim());
        System.out.println(tipoU);
        String[] temp = tipoU.split(";"); 
        if (!"".equals(temp[0]))
        {
            if ("0".equals(temp[1]))
            {
//                Principal principal = new Principal();
//                principal.setTitle("Principal");
//                principal.setVisible(true);
                PrincipalMenu principal = new PrincipalMenu();
                principal.setTitle("Principal");
                principal.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El usuario esta activo");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No tiene acceso");
        }
        
    }//GEN-LAST:event_jButton_conexMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_conex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_user;
    // End of variables declaration//GEN-END:variables
}
