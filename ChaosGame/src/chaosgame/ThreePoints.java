package chaosgame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author sebek
 */
public class ThreePoints extends JPanel {
    private int ax = 300;
    private int ay = 10;
    private int bx = 600;
    private int by = 600;
    private int cx = 10;
    private int cy = 600;

    private Point A = new Point(ax, ay);
    private Point B = new Point(bx, by);
    private Point C = new Point(cx, cy);

    private Point S = new Point(ax, ay);// start anywhere you want
    private int size = 4;

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // call superclass's paintComponent

        setBackground(Color.CYAN);
        g.setColor(Color.RED);
        g.fillOval(ax, ay, size, size);
        g.setColor(Color.BLUE);
        g.fillOval(bx, by, size, size);
        g.setColor(Color.GREEN);
        g.fillOval(cx, cy, size, size);
        int rand = (int) (Math.random() * 3 + 1);// Random number from 1 to 3
        for (int i = 0; i < 1; i++) {
            rand = (int) (Math.random() * 3 + 1);
            if (rand == 1) {
                S.setX(.5 * (A.getX() - S.getX()) + S.getX());
                S.setY(.5 * (A.getY() - S.getY()) + S.getY());
                g.setColor(Color.RED);
                g.fillOval((int) S.getX(), (int) S.getY(), size, size);
            } else if (rand == 2) {
                S.setX(.5 * (B.getX() - S.getX()) + S.getX());
                S.setY(.5 * (B.getY() - S.getY()) + S.getY());
                g.setColor(Color.BLUE);
                g.fillOval((int) S.getX(), (int) S.getY(), size, size);
            } else if (rand == 3) {
                S.setX(.5 * (C.getX() - S.getX()) + S.getX());
                S.setY(.5 * (C.getY() - S.getY()) + S.getY());
                g.setColor(Color.GREEN);
                g.fillOval((int) S.getX(), (int) S.getY(), size, size);
            }
        }
    }
}