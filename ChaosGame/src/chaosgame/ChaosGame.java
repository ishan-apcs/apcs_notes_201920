package chaosgame;

import java.awt.Dimension; // size
import java.awt.Point; //point make objects
import javax.swing.JFrame; //physical window

/**
 *
 * @author sebek
 */
public class ChaosGame {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        // closes frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ThreePoints triangle = new ThreePoints();
        frame.setLocation(new Point(0, 0)); // location on my screen
        frame.setSize(new Dimension(1100, 1100)); // sets size of window
        frame.setPreferredSize(new Dimension(1100, 1100)); // saves size of window
        frame.setTitle("Three Points");
        frame.setVisible(true);
        frame.add(triangle); // add colorJPanel to frame
        frame.pack(); // reduces size of window to preferredSize
    }
}
