/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import MySQL.MySQLDaoManager;
import dao.DAOException;
import dao.DAOManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leori
 */
public class home extends javax.swing.JFrame {

    DAOManager manager;
    int mod;

    /**
     * Creates new form inicio
     */
    
    private home() throws SQLException {
        this.manager = new MySQLDaoManager("localhost", "root", "", "siac");
        initComponents();
        setSize(800, 510);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    public home(int mod) throws SQLException {
        this.manager = new MySQLDaoManager("localhost", "root", "", "siac");
        initComponents();
        setSize(800, 510);
        setResizable(false);
        setLocationRelativeTo(null);
        this.mod = mod;
        if (mod == 1) {
            btnCompra.setVisible(false);
            btnVenta.setVisible(true);
            btnInforme.setVisible(true);
        } else if (mod == 2) {
            btnCompra.setVisible(true);
            btnVenta.setVisible(false);
            btnInforme.setVisible(true);
        }else{
            btnCompra.setVisible(true);
            btnVenta.setVisible(true);
            btnInforme.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCompra = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIAC");
        setSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        btnCompra.setBackground(new java.awt.Color(255, 255, 255));
        btnCompra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping-icon medium.png"))); // NOI18N
        btnCompra.setText("Compra");
        btnCompra.setBorder(null);
        btnCompra.setBorderPainted(false);
        btnCompra.setContentAreaFilled(false);
        btnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompra.setIconTextGap(-3);
        btnCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping-icon small.png"))); // NOI18N
        btnCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping-icon.png"))); // NOI18N
        btnCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompra);
        btnCompra.setBounds(140, 150, 140, 100);

        btnVenta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart-icon medium.png"))); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.setBorder(null);
        btnVenta.setBorderPainted(false);
        btnVenta.setContentAreaFilled(false);
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setIconTextGap(-3);
        btnVenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart-icon small.png"))); // NOI18N
        btnVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart-icon.png"))); // NOI18N
        btnVenta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVenta);
        btnVenta.setBounds(360, 150, 90, 100);

        btnInforme.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnInforme.setForeground(new java.awt.Color(255, 255, 255));
        btnInforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/analytics-icon medium.png"))); // NOI18N
        btnInforme.setText("Informes");
        btnInforme.setBorder(null);
        btnInforme.setBorderPainted(false);
        btnInforme.setContentAreaFilled(false);
        btnInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInforme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInforme.setIconTextGap(-3);
        btnInforme.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/analytics-icon small.png"))); // NOI18N
        btnInforme.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/analytics-icon.png"))); // NOI18N
        btnInforme.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnInforme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });
        getContentPane().add(btnInforme);
        btnInforme.setBounds(560, 150, 110, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIAC");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 50, 130, 40);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(710, 390, 53, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 50, 60, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeOne.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 50, 30, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundHome.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        // TODO add your handling code here:
        Compra ventanaCompra;
        try {
            ventanaCompra = new Compra(manager, mod);
            ventanaCompra.setVisible(true);
            ventanaCompra.setSize(500, 400);
            ventanaCompra.setResizable(false);
        } catch (DAOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
//        dialogCompra.setVisible(true);
//        //this.dispose();
//        dialogCompra.setTitle("Compra");
//        dialogCompra.setSize(850,500);
//        dialogCompra.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        ventVenta ventanaVenta;
        try {
            ventanaVenta = new ventVenta(manager, mod);
            ventanaVenta.setVisible(true);
            ventanaVenta.setTitle("Venta");
            ventanaVenta.setSize(500, 400);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        vtnInformes vtn = new vtnInformes(manager, mod);
        vtn.setTitle("Informes");
        vtn.setVisible(true);
        vtn.setSize(500, 400);
        this.dispose();
    }//GEN-LAST:event_btnInformeActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new home().setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
