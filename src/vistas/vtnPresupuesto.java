/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Material;
import dao.DAOException;
import java.sql.SQLException;
import dao.DAOManager;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.DetallePresupuesto;
import modelo.Presupuesto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vistas.home;
import vistas.ventVenta;

/**
 *
 * @author Lucas
 */
public class vtnPresupuesto extends javax.swing.JFrame {

    private final DAOManager manager;
    private List<Material> listamateriales = new ArrayList<>();
    private List<Material> listaseleccionados = new ArrayList<>();
    int fila = 0;
    float total = 0;

    /**
     * Creates new form presupuesto
     *
     * @throws dao.DAOException
     */
    public vtnPresupuesto(DAOManager manager) throws DAOException {
        initComponents();
        this.manager = manager;
    }

    private vtnPresupuesto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        succes = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botonBuscarMaterial = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMaterialesPedidos = new javax.swing.JTable();
        ingresoidMaterial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSeleccionados = new javax.swing.JTable();
        agregarMaterialesSeleccionados = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        succes.getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Se genero con Exito");
        succes.getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 50, 150, 60);

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        succes.getContentPane().add(aceptar);
        aceptar.setBounds(110, 100, 80, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundHome.png"))); // NOI18N
        succes.getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 300, 200);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Material: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(35, 50, 60, 20);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(681, 450, 100, 30);

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 450, 59, 23);

        botonBuscarMaterial.setText("Buscar");
        botonBuscarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscarMaterial);
        botonBuscarMaterial.setBounds(210, 50, 80, 30);

        tablaMaterialesPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaMaterialesPedidos);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(120, 90, 520, 158);

        ingresoidMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoidMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(ingresoidMaterial);
        ingresoidMaterial.setBounds(90, 50, 110, 30);

        tablaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Cantidad", "Precio Unitario", "Rubro", "Cantidad", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSeleccionados);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 260, 600, 149);

        agregarMaterialesSeleccionados.setText("Agregar");
        agregarMaterialesSeleccionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMaterialesSeleccionadosActionPerformed(evt);
            }
        });
        getContentPane().add(agregarMaterialesSeleccionados);
        agregarMaterialesSeleccionados.setBounds(660, 213, 80, 30);

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular);
        calcular.setBounds(670, 373, 100, 30);

        txttotal.setText("Total");
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal);
        txttotal.setBounds(530, 410, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Presupuesto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 10, 230, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundHome.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarMaterialActionPerformed
        String material;
        material = ingresoidMaterial.getText();
        try {
            listamateriales = manager.getMaterialDAO().obtenerTodosxNombre(material);//cambiar obtener todo por nombre

            setTablaMaterialesPeidos();

        } catch (DAOException ex) {
            Logger.getLogger(vtnPresupuesto.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_botonBuscarMaterialActionPerformed

    public void setTablaMaterialesPeidos() {

        tablaMaterialesPedidos.removeAll();

        String[] columnas = new String[]{
            "Nombre",
            "Descripcion",
            "Cantidad",
            "Precio Unitario",
            "Rubro"
        //"Seleccionar"
        };
        final Class[] tiposColumnas = new Class[]{
            java.lang.String.class,
            java.lang.String.class,
            java.lang.Integer.class,
            java.lang.Float.class,
            java.lang.String.class
//JButton.class
        };
        Object[][] datos = new Object[listamateriales.size()][5];
        int i = 0;

        for (Material m : listamateriales) {
            datos[i][0] = m.getNombre();
            datos[i][1] = m.getdescripcion();
            datos[i][2] = m.getStockMaterial();
            datos[i][3] = m.getPrecioUnitario();
            datos[i][4] = m.getRubro();
            i++;
        }

//        datos[0][0]= mat.getNombre();
//        datos[0][1]= mat.getdescripcion();
//        datos[0][2]= mat.getStockMaterial();
//        datos[0][3]= mat.getPrecioUnitario();
//        datos[0][4]= mat.getRubro();
        tablaMaterialesPedidos.setModel(new javax.swing.table.DefaultTableModel(datos, columnas) {
            Class[] tipos = tiposColumnas;

            @Override
            public Class getColumnClass(int columnIndex) {
                return tipos[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                // Sobrescribimos este método para evitar que la columna que contiene los botones sea editada.
                return false;
            }
        });

    }


    private void ingresoidMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoidMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoidMaterialActionPerformed

    private void agregarMaterialesSeleccionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMaterialesSeleccionadosActionPerformed

        int seleccionado = tablaMaterialesPedidos.getSelectedRow();
        Material m = listamateriales.get(seleccionado);
        listaseleccionados.add(m);
        tablaSeleccionados.setValueAt(m.getNombre(), fila, 0);
        tablaSeleccionados.setValueAt(m.getdescripcion(), fila, 1);
        tablaSeleccionados.setValueAt(m.getStockMaterial(), fila, 2);
        tablaSeleccionados.setValueAt(m.getPrecioUnitario(), fila, 3);
        tablaSeleccionados.setValueAt(m.getRubro(), fila, 4);

        fila++;


    }//GEN-LAST:event_agregarMaterialesSeleccionadosActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        int tamaño = tablaSeleccionados.getRowCount();
        Long sum;
        int i;
        total = 0;
        for (i = 0; i < tamaño; i++) {
            sum = Long.valueOf(tablaSeleccionados.getValueAt(i, 3).toString()) * Long.valueOf(tablaSeleccionados.getValueAt(i, 5).toString());
            tablaSeleccionados.setValueAt(sum, i, 6);
            if (tablaSeleccionados.getValueAt(i + 1, i) == null) {
                i = tamaño + 1;
            }
            total = total + sum;
        }
        txttotal.setText("$" + total);
    }//GEN-LAST:event_calcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {                                         
            LocalDate todayLocalDate = LocalDate.now(ZoneId.of("America/Argentina/Buenos_Aires"));
            java.sql.Date sqlDate = java.sql.Date.valueOf(todayLocalDate);
            Presupuesto Pre = new Presupuesto(null, sqlDate, total);
            try {
                manager.getPresupuestoDAO().insertar(Pre);
            } catch (DAOException ex) {
                Logger.getLogger(vtnPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
            } 
            Long idpre = Pre.getIdPresupuesto();
            int i = 0;
            for (Material m : listaseleccionados) {
                Long subtotal = Long.valueOf(tablaSeleccionados.getValueAt(i, 6).toString());
                Integer cantidad = Integer.valueOf(tablaSeleccionados.getValueAt(i, 5).toString());
                DetallePresupuesto nuevo = new DetallePresupuesto(idpre, m.getidMaterial(), m.getNombre() + " " + m.getdescripcion(), subtotal, cantidad);
                i++;
                try {
                    manager.getDetallePresupuestoDAO().insertar(nuevo);
                } catch (DAOException ex) {
                    Logger.getLogger(vtnPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            JasperReport reporte = null;
//            String path = "src\\informes\\presupuesto.jasper";
            Map parametro = new HashMap();
            parametro.put("idPresupuesto", idpre);
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/informes/presupuesto.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, manager.getConn());
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            succes.setVisible(true);
            succes.setSize(300, 200);
            succes.setTitle("Generado con exito");
            
            
        } catch (JRException ex) {
            Logger.getLogger(vtnPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
//        try {
////            ventVenta v = new ventVenta(manager);
////            v.setVisible(true);
////            v.setSize(500, 400);
////            v.setTitle("Venta");
//
//        } catch (SQLException ex) {
//            Logger.getLogger(vtnPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
//        }
        succes.dispose();
        this.dispose();

    }//GEN-LAST:event_aceptarActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

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
//            java.util.logging.Logger.getLogger(vtnPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(vtnPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(vtnPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(vtnPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vtnPresupuesto().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton agregarMaterialesSeleccionados;
    private javax.swing.JButton botonBuscarMaterial;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField ingresoidMaterial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog succes;
    private javax.swing.JTable tablaMaterialesPedidos;
    private javax.swing.JTable tablaSeleccionados;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
