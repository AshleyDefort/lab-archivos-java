/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.LabArchivos;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ashle
 */
public class ViewInforme extends javax.swing.JFrame {

    /**
     * Creates new form ViewInforme
     */
    public ViewInforme() {
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

        Bg = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblInforme = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("S.A.");
        Bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Automóviles del Caribe");
        Bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/car.png"))); // NOI18N
        Bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 90, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/BgMenu.jpg"))); // NOI18N
        Bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 240, 520));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/favicon (1).png"))); // NOI18N
        jLabel6.setText("Informe de Ventas");
        Bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Automóviles del Caribe S.A.");
        Bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        TblInforme.setBackground(new java.awt.Color(255, 255, 255));
        TblInforme.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TblInforme.setForeground(new java.awt.Color(0, 0, 0));
        TblInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Auto (Marca)", "Cantidad Vendida", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblInforme.setGridColor(new java.awt.Color(255, 255, 255));
        TblInforme.setSelectionBackground(new java.awt.Color(189, 231, 247));
        TblInforme.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TblInforme);

        Bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 490, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel model = (DefaultTableModel) TblInforme.getModel();
         Map<String, MarcaEstadistica> estadisticas = new HashMap<>();

        try {
            FileReader fileReader = new FileReader("Ventas.txt");
            BufferedReader ventas = new BufferedReader(fileReader);

            String line;
            while ((line = ventas.readLine()) != null) {
                String[] data = line.split("\t");
                if (data.length >= 4) { 
                    String marca = data[3];
                    double ganancia = Double.parseDouble(data[4]);

                    // Verifica si la marca ya está en las estadísticas, si no, la crea
                    if (!estadisticas.containsKey(marca)) {
                        estadisticas.put(marca, new MarcaEstadistica(marca));
                    }

                    // Actualiza las estadísticas de la marca
                    MarcaEstadistica marcaEstadistica = estadisticas.get(marca);
                    marcaEstadistica.incrementarCantidadVendida();
                    marcaEstadistica.incrementarGananciaTotal(ganancia);
                }
            }

            ventas.close();

            // Agrega las estadísticas a la tabla
            NumberFormat formatter = new DecimalFormat("#,##0");
            for (MarcaEstadistica marcaEstadistica : estadisticas.values()) {
                double gananciaTotal = marcaEstadistica.getGananciaTotal();
                String gananciaTotalFormateada = formatter.format(gananciaTotal);
                model.addRow(new Object[]{marcaEstadistica.getMarca(), marcaEstadistica.getCantidadVendida(), gananciaTotalFormateada});
            }
        }catch(IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened
    
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
            java.util.logging.Logger.getLogger(ViewInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInforme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JTable TblInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
