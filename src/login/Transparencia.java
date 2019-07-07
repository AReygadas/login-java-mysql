package login;

import java.awt.Color;
import javax.swing.JFrame;

public class Transparencia {
    public void aplicar(JFrame frame){
        frame.setUndecorated(true);
        frame.setBackground(new Color(0,0,0,0));
    }
}
