/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Modelo.Client;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author alexander
 */
public class VentasCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentasCliente
     */
    public VentasCliente() {
        initComponents();
    }

    Client client = new Client();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane_PI = new javax.swing.JTabbedPane();
        jPanel_VentasCliente = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel_ConsultaGeneralVentasCliente = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_ConsultaGeneralCliente = new javax.swing.JTable();
        jButton_executeGeneralVCl = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_ConsultaGeneralCliente1 = new javax.swing.JTable();
        jButton_executeGeneralVCl_Ciudad = new javax.swing.JButton();
        jTextField_City = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel_ConsultaParticularlVentasCliente = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_NombreCliente = new javax.swing.JTextField();
        jButton_executeSpecificVC = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_ConsultaParticularlCliente = new javax.swing.JTable();
        jPanel_ConsultaGraficoVentasCliente = new javax.swing.JPanel();
        jPanel_GraficoVentasCliente = new javax.swing.JPanel();
        jButton_GraficoVentasCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable_ConsultaGeneralCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Numero Contacto", "Empresa", "Precio Total Facturas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_ConsultaGeneralCliente);

        jButton_executeGeneralVCl.setText("Ejecutar");
        jButton_executeGeneralVCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_executeGeneralVClActionPerformed(evt);
            }
        });

        jTable_ConsultaGeneralCliente1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Numero Contacto", "Empresa", "Precio Total Facturas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable_ConsultaGeneralCliente1);

        jButton_executeGeneralVCl_Ciudad.setText("Ejecutar");
        jButton_executeGeneralVCl_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_executeGeneralVCl_CiudadActionPerformed(evt);
            }
        });

        jLabel1.setText("Ciudad:");

        javax.swing.GroupLayout jPanel_ConsultaGeneralVentasClienteLayout = new javax.swing.GroupLayout(jPanel_ConsultaGeneralVentasCliente);
        jPanel_ConsultaGeneralVentasCliente.setLayout(jPanel_ConsultaGeneralVentasClienteLayout);
        jPanel_ConsultaGeneralVentasClienteLayout.setHorizontalGroup(
            jPanel_ConsultaGeneralVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton_executeGeneralVCl))
                    .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton_executeGeneralVCl_Ciudad)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6)
                    .addContainerGap()))
        );
        jPanel_ConsultaGeneralVentasClienteLayout.setVerticalGroup(
            jPanel_ConsultaGeneralVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jButton_executeGeneralVCl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_executeGeneralVCl_Ciudad)
                .addContainerGap())
            .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_ConsultaGeneralVentasClienteLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Consulta General", jPanel_ConsultaGeneralVentasCliente);

        jLabel10.setText("Nombre:");

        jButton_executeSpecificVC.setText("Ejecutar");
        jButton_executeSpecificVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_executeSpecificVCActionPerformed(evt);
            }
        });

        jTable_ConsultaParticularlCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Numero Contacto", "Empresa", "Precio Total Facturas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable_ConsultaParticularlCliente);

        javax.swing.GroupLayout jPanel_ConsultaParticularlVentasClienteLayout = new javax.swing.GroupLayout(jPanel_ConsultaParticularlVentasCliente);
        jPanel_ConsultaParticularlVentasCliente.setLayout(jPanel_ConsultaParticularlVentasClienteLayout);
        jPanel_ConsultaParticularlVentasClienteLayout.setHorizontalGroup(
            jPanel_ConsultaParticularlVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ConsultaParticularlVentasClienteLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jButton_executeSpecificVC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(241, 241, 241))
            .addGroup(jPanel_ConsultaParticularlVentasClienteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(73, 73, 73)
                .addComponent(jTextField_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_ConsultaParticularlVentasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel_ConsultaParticularlVentasClienteLayout.setVerticalGroup(
            jPanel_ConsultaParticularlVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConsultaParticularlVentasClienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_ConsultaParticularlVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_executeSpecificVC)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Consulta Detallada", jPanel_ConsultaParticularlVentasCliente);

        javax.swing.GroupLayout jPanel_GraficoVentasClienteLayout = new javax.swing.GroupLayout(jPanel_GraficoVentasCliente);
        jPanel_GraficoVentasCliente.setLayout(jPanel_GraficoVentasClienteLayout);
        jPanel_GraficoVentasClienteLayout.setHorizontalGroup(
            jPanel_GraficoVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        jPanel_GraficoVentasClienteLayout.setVerticalGroup(
            jPanel_GraficoVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jButton_GraficoVentasCliente.setText("Graficar");
        jButton_GraficoVentasCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GraficoVentasClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ConsultaGraficoVentasClienteLayout = new javax.swing.GroupLayout(jPanel_ConsultaGraficoVentasCliente);
        jPanel_ConsultaGraficoVentasCliente.setLayout(jPanel_ConsultaGraficoVentasClienteLayout);
        jPanel_ConsultaGraficoVentasClienteLayout.setHorizontalGroup(
            jPanel_ConsultaGraficoVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConsultaGraficoVentasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_GraficoVentasCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ConsultaGraficoVentasClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_GraficoVentasCliente)
                .addGap(140, 140, 140))
        );
        jPanel_ConsultaGraficoVentasClienteLayout.setVerticalGroup(
            jPanel_ConsultaGraficoVentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ConsultaGraficoVentasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_GraficoVentasCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton_GraficoVentasCliente)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Grafico", jPanel_ConsultaGraficoVentasCliente);

        javax.swing.GroupLayout jPanel_VentasClienteLayout = new javax.swing.GroupLayout(jPanel_VentasCliente);
        jPanel_VentasCliente.setLayout(jPanel_VentasClienteLayout);
        jPanel_VentasClienteLayout.setHorizontalGroup(
            jPanel_VentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel_VentasClienteLayout.setVerticalGroup(
            jPanel_VentasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane_PI.addTab("Ventas Por Cliente", jPanel_VentasCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_PI)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_PI)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_executeGeneralVClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_executeGeneralVClActionPerformed
        String[] nombres = {"Nombre", "Numero de Contacto", "Empresa", "Numero de facturas"};

        String[] filasT = client.consultaGeneralCliente("0;0","").split("\\n");

        DefaultTableModel dtm = new DefaultTableModel(nombres, filasT.length);
        dtm = (DefaultTableModel) this.jTable_ConsultaGeneralCliente.getModel();
        this.jTable_ConsultaGeneralCliente.removeAll();

        for (String s : filasT)
        {
            String[] columnasT = s.split("\\t");
            dtm.addRow(new Object[]{columnasT[1], columnasT[2], columnasT[3], columnasT[4]});
        }
    }//GEN-LAST:event_jButton_executeGeneralVClActionPerformed

    private void jButton_executeSpecificVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_executeSpecificVCActionPerformed
        // TODO add your handling code here:
        String[] respuesta = client.consultaGeneralCliente("0;" + jTextField_NombreCliente.getText(), "").split(";");
        String[] nombres = {"Nombre", "Numero de Contacto", "Empresa", "Numero de facturas"};
        DefaultTableModel dtm = new DefaultTableModel(nombres, respuesta.length);
        dtm = (DefaultTableModel) this.jTable_ConsultaParticularlCliente.getModel();
        this.jTable_ConsultaGeneralCliente.removeAll();

        for (String s : respuesta)
        {
            String[] columnasT = s.split("\\t");
            dtm.addRow(new Object[]{columnasT[1], columnasT[2], columnasT[3], columnasT[4]});
        }

    }//GEN-LAST:event_jButton_executeSpecificVCActionPerformed

    private void jButton_GraficoVentasClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GraficoVentasClienteActionPerformed
        // TODO add your handling code here:
        jPanel_GraficoVentasCliente.setLayout(new BorderLayout());
        jPanel_GraficoVentasCliente.add(new ChartPanel(createChart(createDataset(client.consultaGeneralCliente("0;0", "").split("\\n")), "Clientes")), BorderLayout.CENTER);
        jPanel_GraficoVentasCliente.validate();
    }//GEN-LAST:event_jButton_GraficoVentasClienteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        client.cerrarSesion();
    }//GEN-LAST:event_formWindowClosing

    private void jButton_executeGeneralVCl_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_executeGeneralVCl_CiudadActionPerformed
        
        String[] respuesta = client.consultaGeneralCliente("0;" + jTextField_NombreCliente.getText(), jTextField_City.getText().trim()).split(";");
        String[] nombres = {"Nombre", "Numero de Contacto", "Empresa", "Numero de facturas"};
        DefaultTableModel dtm = new DefaultTableModel(nombres, respuesta.length);
        dtm = (DefaultTableModel) this.jTable_ConsultaParticularlCliente.getModel();
        this.jTable_ConsultaGeneralCliente.removeAll();

        for (String s : respuesta)
        {
            String[] columnasT = s.split("\\t");
            dtm.addRow(new Object[]{columnasT[1], columnasT[2], columnasT[3], columnasT[4]});
        }
        
    }//GEN-LAST:event_jButton_executeGeneralVCl_CiudadActionPerformed

    private PieDataset createDataset(String[] filasT)
    {
        DefaultPieDataset pieDataset = new DefaultPieDataset();
//        String[] filasT = client.consultaGeneralCiudad("0;0").split("\\n");
        for (String s : filasT)
        {
            String[] columnaT = s.split("\\t");
            pieDataset.setValue(columnaT[1], Double.parseDouble(columnaT[2]));
        }
        return pieDataset;
    }
    
    private PieDataset createDataset2(String[] filasT)
    {
        DefaultPieDataset pieDataset = new DefaultPieDataset();
//        String[] filasT = client.consultaGeneralCiudad("0;0").split("\\n");
        for (String s : filasT)
        {
            String[] columnaT = s.split("\\t");
            pieDataset.setValue(columnaT[1], Double.parseDouble(columnaT[5]));
        }
        return pieDataset;
    }
    
    private JFreeChart createChart(PieDataset dataset, String title) {
        
        JFreeChart chart = ChartFactory.createPieChart3D(title,          // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false);
        //chart.getLegend();
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
        
    }
    
    
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
            java.util.logging.Logger.getLogger(VentasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentasCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GraficoVentasCliente;
    private javax.swing.JButton jButton_executeGeneralVCl;
    private javax.swing.JButton jButton_executeGeneralVCl_Ciudad;
    private javax.swing.JButton jButton_executeSpecificVC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel_ConsultaGeneralVentasCliente;
    private javax.swing.JPanel jPanel_ConsultaGraficoVentasCliente;
    private javax.swing.JPanel jPanel_ConsultaParticularlVentasCliente;
    private javax.swing.JPanel jPanel_GraficoVentasCliente;
    private javax.swing.JPanel jPanel_VentasCliente;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane_PI;
    private javax.swing.JTable jTable_ConsultaGeneralCliente;
    private javax.swing.JTable jTable_ConsultaGeneralCliente1;
    private javax.swing.JTable jTable_ConsultaParticularlCliente;
    private javax.swing.JTextField jTextField_City;
    private javax.swing.JTextField jTextField_NombreCliente;
    // End of variables declaration//GEN-END:variables
}
