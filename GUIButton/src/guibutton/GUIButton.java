package guibutton;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author sebek
 */
public class GUIButton {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creates a frame containing two buttons.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(100, 100)); // location on my screen
        frame.setSize(new Dimension(500, 500));
        frame.setTitle("Two buttons");
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton();
        button1.setText("I'm a button.");
        button1.setBackground(Color.BLUE);
        button1.setPreferredSize(new Dimension(150, 20));
        frame.add(button1);

        // attach a listener to handle events on this button
        button1.addActionListener(new MessageListener());

        JButton button2 = new JButton();
        button2.setText("Click me!");
        button2.setBackground(Color.RED);
        button2.setPreferredSize(new Dimension(100, 50));
        frame.add(button2);

        frame.pack();
        frame.setVisible(true);

    }

}
