package chaosgame;

/**
 *
 * @author sebek
 */
public class Point {
    private double x = 0;
    private double y = 0;

    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point(double new_x, double new_y) {
        x = new_x;
        y = new_y;
    }

    public void setPoint(double new_x, double new_y) {
        x = new_x;
        y = new_y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double new_x) {
        x = new_x;
    }

    public void setY(double new_y) {
        y = new_y;
    }

    public String toString() {
        return String.format("Your point is x:%f y:%f", x, y);
    }
}
