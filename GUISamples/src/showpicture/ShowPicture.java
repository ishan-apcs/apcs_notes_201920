package showpicture;

/**
 *
 * @author sebek
 */

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ShowPicture {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        // ImageIcon icon = new ImageIcon("2clubs.GIF");
        // ImageIcon icon = new ImageIcon("src\\2clubs.GIF");
        ImageIcon icon = new ImageIcon("src\\showpicture\\2clubs.GIF");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setLocation(new Point(100, 100)); // location on my screen
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.pack();
        frame.setVisible(true);
    }
}