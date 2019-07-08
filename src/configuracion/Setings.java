package configuracion;

import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import configuracion.Configuracion;

/**
 * @author Arturo Reygadas Gonzalez
 */

public final class Setings extends javax.swing.JFrame {
    Configuracion confi = new Configuracion();
    
    public Setings() {
       initComponents();
       setIconImage( new ImageIcon(getClass().getResource("/img/others/conf_frame.png")).getImage());
       block();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelReflect1 = new org.edisoncor.gui.panel.PanelReflect();
        ip1 = new javax.swing.JTextField();
        ip2 = new javax.swing.JTextField();
        ip3 = new javax.swing.JTextField();
        ip4 = new javax.swing.JTextField();
        puerto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask3 = new org.edisoncor.gui.button.ButtonTask();
        panelReflect2 = new org.edisoncor.gui.panel.PanelReflect();
        jLabel4 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        bd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONFIGURACION");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/background.jpg"))); // NOI18N

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/lmgFondo.jpg"))); // NOI18N

        panelReflect1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        ip1.setNextFocusableComponent(ip2);
        ip1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ip1KeyReleased(evt);
            }
        });

        ip2.setNextFocusableComponent(ip3);
        ip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip2ActionPerformed(evt);
            }
        });
        ip2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ip2KeyReleased(evt);
            }
        });

        ip3.setNextFocusableComponent(ip4);
        ip3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip3ActionPerformed(evt);
            }
        });
        ip3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ip3KeyReleased(evt);
            }
        });

        ip4.setNextFocusableComponent(puerto);
        ip4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ip4KeyReleased(evt);
            }
        });

        puerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                puertoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Ip del Servidor");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Puerto");

        javax.swing.GroupLayout panelReflect1Layout = new javax.swing.GroupLayout(panelReflect1);
        panelReflect1.setLayout(panelReflect1Layout);
        panelReflect1Layout.setHorizontalGroup(
            panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReflect1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(panelReflect1Layout.createSequentialGroup()
                        .addComponent(ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puerto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelReflect1Layout.setVerticalGroup(
            panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReflect1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelReflect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ip4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonTask2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/22112-bubka-ControlPanel.png"))); // NOI18N
        buttonTask2.setText("Restaurar");
        buttonTask2.setCategoryFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        buttonTask2.setCategorySmallFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonTask2.setDescription("Conf. por Defecto");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });

        buttonTask3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/palomita_1.png"))); // NOI18N
        buttonTask3.setText("Guardar");
        buttonTask3.setCategoryFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        buttonTask3.setCategorySmallFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonTask3.setDescription("Configuracion");
        buttonTask3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask3ActionPerformed(evt);
            }
        });

        panelReflect2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Usuario");

        usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 102, 153));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setNextFocusableComponent(pass);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Contraceña");

        pass.setForeground(new java.awt.Color(0, 102, 153));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setNextFocusableComponent(bd);

        bd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bd.setForeground(new java.awt.Color(0, 153, 51));
        bd.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Nombre de la Base de Datos");

        javax.swing.GroupLayout panelReflect2Layout = new javax.swing.GroupLayout(panelReflect2);
        panelReflect2.setLayout(panelReflect2Layout);
        panelReflect2Layout.setHorizontalGroup(
            panelReflect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReflect2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReflect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReflect2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel6))
                    .addGroup(panelReflect2Layout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelReflect2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelReflect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelReflect2Layout.setVerticalGroup(
            panelReflect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReflect2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelReflect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelReflect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonTask4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos/iSync-icon.png"))); // NOI18N
        buttonTask4.setText("Reiniciar");
        buttonTask4.setCategoryFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        buttonTask4.setCategorySmallFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buttonTask4.setDescription("Sistema");
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelReflect2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelReflect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTask3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTask2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(buttonTask4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addComponent(panelReflect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelReflect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTask3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonTask4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Conexion a Base de Datos", panelImage2);

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/background.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Apariencia", panelImage4);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(panelImage1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void block()
{
    RestrictedTextField rtfx=new RestrictedTextField(ip1);
    RestrictedTextField rtfz=new RestrictedTextField(ip2);
    RestrictedTextField rtfy=new RestrictedTextField(ip3);
    RestrictedTextField rtfv=new RestrictedTextField(ip4);
    rtfx.setLimit(3);
    rtfz.setLimit(3);
    rtfy.setLimit(3);
    rtfv.setLimit(3);
    rtfx.setOnlyNums(true);
    rtfz.setOnlyNums(true);
    rtfy.setOnlyNums(true);
    rtfv.setOnlyNums(true);   
}
    private void buttonTask2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask2ActionPerformed
       ip1.setText("127");
       ip2.setText("0");
       ip3.setText("0");
       ip4.setText("1");
       puerto.setText("3306");
       usuario.setText("root");
       pass.setText(" ");
       bd.setText("gqdata");
               
    }//GEN-LAST:event_buttonTask2ActionPerformed

    private void buttonTask3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask3ActionPerformed
        String ipfull=""+ip1.getText()+"."+ip2.getText()+"."+ip3.getText()+"."+ip4.getText()+"";
        confi.Guardar_Configuracion("/"+ipfull+ "/"+puerto.getText()+"/"+bd.getText()+"/"+usuario.getText()+"/"+pass.getText()+"/");
        JOptionPane.showMessageDialog(null,"Guardado","Configuracion Guardada",JOptionPane.OK_OPTION, new ImageIcon(getClass().getResource("/img/save.png")));
    }//GEN-LAST:event_buttonTask3ActionPerformed

    private void ip1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ip1KeyReleased
        if (ip1.getText().length()==3) {
            ip2.requestFocus();
        } else {
        }
    }//GEN-LAST:event_ip1KeyReleased

    private void puertoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_puertoKeyReleased
         if (puerto.getText().length()==4) {
            usuario.requestFocus();
        } else {
        }
    }//GEN-LAST:event_puertoKeyReleased

    private void ip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip2ActionPerformed

    private void ip3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip3ActionPerformed

    private void ip2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ip2KeyReleased
        if (ip2.getText().length()==3) {
           ip3.requestFocus();
        } else {
        }
    }//GEN-LAST:event_ip2KeyReleased

    private void ip3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ip3KeyReleased
         if (ip3.getText().length()==3) {
            ip4.requestFocus();
        } else {
        }
    }//GEN-LAST:event_ip3KeyReleased

    private void ip4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ip4KeyReleased
        if (ip4.getText().length()==3) {
            puerto.requestFocus();
        } else {
        }
    }//GEN-LAST:event_ip4KeyReleased

    private void buttonTask4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask4ActionPerformed
        new Thread ((Runnable) new login.Splash()).start();
        this.hide();
    }//GEN-LAST:event_buttonTask4ActionPerformed
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
            java.util.logging.Logger.getLogger(Setings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bd;
    private org.edisoncor.gui.button.ButtonTask buttonTask2;
    private org.edisoncor.gui.button.ButtonTask buttonTask3;
    private org.edisoncor.gui.button.ButtonTask buttonTask4;
    private javax.swing.JTextField ip1;
    private javax.swing.JTextField ip2;
    private javax.swing.JTextField ip3;
    private javax.swing.JTextField ip4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelReflect panelReflect1;
    private org.edisoncor.gui.panel.PanelReflect panelReflect2;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField puerto;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
