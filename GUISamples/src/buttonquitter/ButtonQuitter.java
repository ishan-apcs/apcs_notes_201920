package buttonquitter;

/**
 * @author sebek
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonQuitter extends JFrame implements ActionListener {
    JButton bQuit = new JButton("Click here to Exit");

    public ButtonQuitter(String title) {
        super(title);
        setLayout(new FlowLayout());
        bQuit.addActionListener(this);
        add(bQuit);
    }

    public void actionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String[] args) {
        ButtonQuitter frame = new ButtonQuitter("Button Quitter");
        frame.setLocation(new Point(700, 400)); // location on my screen
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
