package samplewindow;

import javax.swing.JFrame;

/**
 *
 * @author sebek
 */
public class SampleWindow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new GraphicOptions();
        frame.setTitle("Move with keys");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.requestFocus(); // set the focus to JFrame to receive KeyEvent

    }

}
