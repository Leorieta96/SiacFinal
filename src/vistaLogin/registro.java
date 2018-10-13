
package vistaLogin;

import modeloLogin.Hash;
import javax.swing.JOptionPane;
import modeloLogin.SqlUsuarios;
import modeloLogin.Usuarios;

/**
 *
 * @author Marko
 */
public class registro extends javax.swing.JFrame {

    /**
     * Creates new form registro
     */
    public registro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmaPassword = new javax.swing.JPasswordField();
        cbTipoEmpleado = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(170, 200, 200, 23);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(170, 240, 200, 23);

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(220, 330, 87, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 80, 50, 17);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(170, 80, 200, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 120, 63, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>Confirmar Password:</html>");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 150, 70, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 200, 54, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>Tipo de empleado: </html>");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 270, 80, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 240, 40, 17);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtPassword);
        txtPassword.setBounds(170, 120, 200, 23);

        txtConfirmaPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtConfirmaPassword);
        txtConfirmaPassword.setBounds(170, 160, 200, 23);

        cbTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Venta", "Compra" }));
        cbTipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipoEmpleado);
        cbTipoEmpleado.setBounds(190, 280, 90, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 20, 60, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SIAC");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 20, 130, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeOne.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 20, 30, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundHome.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        String pass = new String(txtPassword.getPassword());
        String passC = new String(txtConfirmaPassword.getPassword());

        if (txtUsuario.getText().equals("") || pass.equals("") || passC.equals("") || txtNombre.getText().equals("") || txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {

            if (pass.equals(passC)) {

                if (modSql.existeUsuario(txtUsuario.getText()) == 0) {

                    if (modSql.esEmail(txtEmail.getText())) {

                        String nuevoPass = Hash.sha1(pass);

                        mod.setUsuario(txtUsuario.getText());
                        mod.setPassword(nuevoPass);
                        mod.setNombre(txtNombre.getText());
                        mod.setEmail(txtEmail.getText());
                        if(cbTipoEmpleado.getSelectedItem().equals("Venta")){
                            mod.setIdTipo(1);
                        }else{
                            mod.setIdTipo(2);
                        }
                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                            limpiar();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El email es incorrecto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        Inicio.frmReg = null;

    }//GEN-LAST:event_formWindowClosing

    private void cbTipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoEmpleadoActionPerformed

    private void limpiar() {
        txtUsuario.setText("");
        txtPassword.setText("");
        txtConfirmaPassword.setText("");
        txtNombre.setText("");
        txtEmail.setText("");
    }

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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cbTipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPasswordField txtConfirmaPassword;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
