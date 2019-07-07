package login;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 * @author ArDev
 */
public class Splash extends javax.swing.JFrame implements Runnable{
    Thread t;
    int _var = 1;
    
    public Splash() {
        setIconImage( new ImageIcon(getClass().getResource("/img/others/framex.png")).getImage());
       _var = (int) (Math.random() * 11) + 1;
        Transparencia trans = new Transparencia();
        trans.aplicar(this);
        //setIconImage(new ImageIcon(getClass().getResource("/img/Llogo.png")).getImage());
        initComponents();
       //jLabel1.setIcon(new ImageIcon(System.getProperty("user.dir")+"/src/img/l"+String.valueOf(_var)+".gif"));
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gifs/l"+String.valueOf(_var)+".gif")));
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new Splash().setVisible(true);
        });
    }

    @Override
    public void run() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
           try {
         
        for (int i = 0; i < 100; i++) {
            t.sleep(50);
        }
        this.dispose();
                LoginForm lf = new LoginForm();
               // lf.setExtendedState(JFrame.MAXIMIZED_BOTH); //inicia la ventana maximizada
                lf.setLocationRelativeTo(null);
                lf.show();
        } catch (InterruptedException ex) {
           Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
