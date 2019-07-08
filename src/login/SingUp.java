package login;

import java.sql.Connection;
import conexion.ConexionDB;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;


/**
 * @author areyg
 */
public class SingUp extends javax.swing.JFrame {
    
    public SingUp() {
        initComponents();
        label3.setText("");
        label2.setText("");
        alerta1.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven2 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        correo = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        contraseña1 = new org.edisoncor.gui.passwordField.PasswordFieldRoundBackground();
        Nombre = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        Usuario = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        contraseña2 = new org.edisoncor.gui.passwordField.PasswordFieldRoundBackground();
        alerta1 = new org.edisoncor.gui.label.LabelMetric();
        label3 = new org.edisoncor.gui.label.LabelMetric();
        label2 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/background.jpg"))); // NOI18N

        buttonSeven1.setBackground(new java.awt.Color(0, 102, 255));
        buttonSeven1.setBorder(null);
        buttonSeven1.setText("Guardar");
        buttonSeven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven1ActionPerformed(evt);
            }
        });

        buttonSeven2.setBackground(new java.awt.Color(255, 51, 51));
        buttonSeven2.setText("Salir");
        buttonSeven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven2ActionPerformed(evt);
            }
        });

        buttonSeven3.setBackground(new java.awt.Color(153, 0, 204));
        buttonSeven3.setText("Ingresa");
        buttonSeven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeven3ActionPerformed(evt);
            }
        });

        correo.setForeground(new java.awt.Color(102, 204, 255));
        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo.setDescripcion("Correo");
        correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoFocusLost(evt);
            }
        });

        contraseña1.setForeground(new java.awt.Color(153, 0, 153));
        contraseña1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseña1.setDescripcion("introduce Contraseña");

        Nombre.setForeground(new java.awt.Color(0, 102, 255));
        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.setDescripcion("Nombre");

        Usuario.setForeground(new java.awt.Color(0, 51, 204));
        Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Usuario.setDescripcion("Nombre de Usuario");
        Usuario.setMaximumSize(new java.awt.Dimension(2147483647, 214748));
        Usuario.setMinimumSize(new java.awt.Dimension(17, 15));
        Usuario.setPreferredSize(new java.awt.Dimension(100, 20));
        Usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsuarioFocusLost(evt);
            }
        });

        contraseña2.setForeground(new java.awt.Color(204, 102, 255));
        contraseña2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseña2.setDescripcion("Repite la Contraseña");
        contraseña2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraseña2KeyReleased(evt);
            }
        });

        alerta1.setForeground(new java.awt.Color(255, 0, 51));
        alerta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alerta1.setText("labelMetric1");

        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("labelMetric1");

        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("labelMetric1");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contraseña2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contraseña1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alerta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelImage1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSeven3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alerta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeven2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        getContentPane().add(panelImage1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSeven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven3ActionPerformed
        this.dispose();
        LoginForm lg = new LoginForm();
        lg.setLocationRelativeTo(null);
        lg.show();
    }//GEN-LAST:event_buttonSeven3ActionPerformed

    private void buttonSeven1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven1ActionPerformed
        GuardarUsuario();
    }//GEN-LAST:event_buttonSeven1ActionPerformed

    public void GuardarUsuario(){
        if(label3.getText().equals("Usuario Disponible")){
            if (label2.getText().equals("Correo Disponible")) {
                if(alerta1.getText().equals("Las contraseñas coinciden")){
                    
                    String md5 = DigestUtils.md5Hex(contraseña1.getText());
                    try {
                        Connection cn = (Connection)ConexionDB.GetConnection();
                        Statement st = cn.createStatement();
                        st.executeUpdate("INSERT INTO `login_db`.`usuarios` (`Usuario`, `Nombre`, `Correo`, `Contraseña`, `lv`) "
                                + "VALUES ('"+Usuario.getText()+"', '"+Nombre.getText()+"', '"+correo.getText()+"', '"+md5+"', '5');");
                        
                        cn.close();
                        st.cancel();
                        JOptionPane.showMessageDialog(null, "Usuario Guardado");
                        Usuario.setText("");
                        Nombre.setText("");
                        correo.setText("");
                        contraseña1.setText("");
                        contraseña2.setText("");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e+" No se puedo guardar el registro");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El correo ya esta registrado");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
        }
    }
    private void contraseña2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseña2KeyReleased
        if (contraseña1.getText().equals(contraseña2.getText())) {
            alerta1.setForeground(Color.green);
            alerta1.setText("Las contraseñas coinciden");
        }else{
            alerta1.setText("Las contraseñas no coinciden");
        }
    }//GEN-LAST:event_contraseña2KeyReleased

    private void UsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsuarioFocusLost
        try {
            Connection cn = (Connection)conexion.ConexionDB.GetConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM login_db.usuarios where Usuario = '"+Usuario.getText()+"' ;");
            if (rs.next()) {
                 label3.setForeground(Color.red);
                label3.setText("Usuario Registrado");
                
            }else{
               label3.setForeground(Color.green);
                label3.setText("Usuario Disponible");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UsuarioFocusLost

    private void correoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusLost
            try {
            Connection cn = (Connection)conexion.ConexionDB.GetConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM login_db.usuarios where Correo = '"+correo.getText()+"';");
            if (rs.next()) {
                label2.setForeground(Color.red);
                label2.setText("Correo Registrado");
                
            }else{
                label2.setForeground(Color.green);
                label2.setText("Correo Disponible");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_correoFocusLost

    private void buttonSeven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeven2ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_buttonSeven2ActionPerformed

    private void ValidarContraseña(){
         if(contraseña1.getText().equals(contraseña2.getText())){
            
        }        
        
        try {
            Connection cn = (Connection)ConexionDB.GetConnection();
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.textField.TextFieldRoundBackground Nombre;
    private org.edisoncor.gui.textField.TextFieldRoundBackground Usuario;
    private org.edisoncor.gui.label.LabelMetric alerta1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven2;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundBackground contraseña1;
    private org.edisoncor.gui.passwordField.PasswordFieldRoundBackground contraseña2;
    private org.edisoncor.gui.textField.TextFieldRoundBackground correo;
    private org.edisoncor.gui.label.LabelMetric label2;
    private org.edisoncor.gui.label.LabelMetric label3;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
