import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Snoemann {
    public static void main(String [] args){
        JFrame vindu = new JFrame("Snoemann");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        vindu.add(panel);
        
        panel.add(new SnoemannTegning());
        vindu.pack();
        vindu.setVisible(true);
    }

}

