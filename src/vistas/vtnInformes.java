/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import MySQL.MySQLDaoManager;
import dao.DAOManager;
import java.sql.SQLException;
import java.util.Calendar;
import vistas.home;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author leori
 */
public class vtnInformes extends javax.swing.JFrame {

    private final DAOManager manager;
    private int mod;
    private int idUsuario;
    
    public vtnInformes(DAOManager manager, int mod, int idUsuario) {
        initComponents();
        this.manager = manager;
        this.mod = mod;
        this.idUsuario = idUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogHistorial = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarHistorial = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        dateHistorial = new datechooser.beans.DateChooserCombo();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPedidoCliente = new javax.swing.JButton();
        btnPedidoProveedor = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        dialogHistorial.getContentPane().setLayout(null);

        jLabel4.setText("Historial");
        dialogHistorial.getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 40, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario: ");
        dialogHistorial.getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 90, 60, 20);
        dialogHistorial.getContentPane().add(txtUsuario);
        txtUsuario.setBounds(150, 90, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Desde:");
        dialogHistorial.getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 130, 50, 20);

        btnBuscarHistorial.setText("Buscar");
        btnBuscarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHistorialActionPerformed(evt);
            }
        });
        dialogHistorial.getContentPane().add(btnBuscarHistorial);
        btnBuscarHistorial.setBounds(270, 130, 65, 23);

        btnAtras.setText("Atrás");
        dialogHistorial.getContentPane().add(btnAtras);
        btnAtras.setBounds(40, 240, 59, 23);
        dialogHistorial.getContentPane().add(dateHistorial);
        dateHistorial.setBounds(140, 130, 120, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundHome.png"))); // NOI18N
        dialogHistorial.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 500);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 30, 166, 44);

        btnPedidoCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnPedidoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedidoCliente.setForeground(new java.awt.Color(0, 153, 204));
        btnPedidoCliente.setText("Pedidos de Cliente");
        btnPedidoCliente.setBorder(null);
        btnPedidoCliente.setBorderPainted(false);
        btnPedidoCliente.setContentAreaFilled(false);
        btnPedidoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedidoCliente);
        btnPedidoCliente.setBounds(270, 170, 160, 50);

        btnPedidoProveedor.setBackground(new java.awt.Color(255, 255, 255));
        btnPedidoProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedidoProveedor.setForeground(new java.awt.Color(0, 153, 204));
        btnPedidoProveedor.setText("Pedidos por Proveedor");
        btnPedidoProveedor.setBorder(null);
        btnPedidoProveedor.setBorderPainted(false);
        btnPedidoProveedor.setContentAreaFilled(false);
        btnPedidoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedidoProveedor);
        btnPedidoProveedor.setBounds(90, 170, 160, 50);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 3)); // NOI18N
        jTextArea1.setRows(5);
        getContentPane().add(jTextArea1);
        jTextArea1.setBounds(90, 170, 160, 50);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        getContentPane().add(jTextArea3);
        jTextArea3.setBounds(270, 170, 164, 50);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 320, 59, 23);

        jButton2.setText("Historial de Acciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 260, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundHome.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoProveedorActionPerformed
        try {
            JasperReport reporte = null;
//            String path = "src\\informes\\pedidoRealizadosProveedor.jasper";
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/informes/pedidoRealizadosProveedor.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, manager.getConn());
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(vtnInformes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnPedidoProveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            home vtnHome = new home(mod,idUsuario);
            vtnHome.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(vtnInformes.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPedidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoClienteActionPerformed
        try {
            JasperReport reporte = null;
//            String path = "src\\informes\\estadosPedidosClientes.jasper";
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/informes/estadosPedidosClientes.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, manager.getConn());
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(vtnInformes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPedidoClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHistorialActionPerformed
        // TODO add your handling code here:
        if(validaciones.isString(txtUsuario.getText())){
            Calendar date = dateHistorial.getSelectedDate();
            
        }
    }//GEN-LAST:event_btnBuscarHistorialActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) throws SQLException {
//        DAOManager manager = new MySQLDaoManager("localhost", "root", "", "siac");
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vtnInformes(manager).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarHistorial;
    private javax.swing.JButton btnPedidoCliente;
    private javax.swing.JButton btnPedidoProveedor;
    private datechooser.beans.DateChooserCombo dateHistorial;
    private javax.swing.JDialog dialogHistorial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
