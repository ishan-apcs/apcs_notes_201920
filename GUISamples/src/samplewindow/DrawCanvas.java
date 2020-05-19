package samplewindow;

import java.awt.*; // Using AWT's Graphics and Color
import javax.swing.*; // Using Swing's components and containers

/**
 *
 * @author sebek
 */
public class DrawCanvas extends JPanel {
    // Define constants for the various dimensions
    public static final int CANVAS_WIDTH = 400;
    public static final int CANVAS_HEIGHT = 400;
    public static final int OBJECT_SIZE = 50;
    public static final Color OBJECT_COLOR = new Color(255, 0, 0, 100);
    public static final Color CANVAS_BACKGROUND = Color.BLUE;

    // The moving line from (x1, y1) initially position at the center
    private int x1 = CANVAS_WIDTH / 2;
    private int y1 = CANVAS_HEIGHT / 2;
    private int size = OBJECT_SIZE;

    public void changeX1(int inX) {
        x1 = x1 + inX;
    }

    public void changeY1(int inY) {
        y1 = y1 + inY;
    }

    public void paintComponent(Graphics g) {
        // if you would like text or more or different object
        // we would put them in here
        super.paintComponent(g);

        g.setFont(new Font("Arial", Font.BOLD, 30));
        // Get font metrics for the current font
        FontMetrics fm = g.getFontMetrics();
        // Centralize the string
        String msg = "Hello, world!";
        int msgWidth = fm.stringWidth(msg);
        int msgAscent = fm.getAscent();
        // Get the position of the leftmost character in the baseline
        // getWidth() and getHeight() returns the width and height of this component
        int msgX = getWidth() / 2 - msgWidth / 2;
        int msgY = getHeight() / 20 + msgAscent / 2;
        g.drawString(msg, msgX, msgY);

        setBackground(CANVAS_BACKGROUND);
        g.setColor(OBJECT_COLOR);
        g.fillOval(x1, y1, size, size);
        g.drawRoundRect(2 * x1, 2 * y1, size, size, 30, 30);
    }
}
