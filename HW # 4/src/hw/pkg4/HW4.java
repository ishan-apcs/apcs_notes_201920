/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg4;

/**
 *
 * @author ishanmadan
 */
public class HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Person p = new OldLady("Robinson", 92); System.out.println(p + ", " +
         * ((OldLady) p).getAge());
         */

        /*
         * Comparable<Integer> x = new Integer(123); // Line 1
         * System.out.println(x.compareTo("123")); // Line 2
         */

        /* FilledRectangle r1 = new Rectangle();
        double height = r1.getHeight();

        Rectangle r2 = new FilledRectangle();
        double height2 = r2.getHeight();

        System.out.println(height2);

        Rectangle r3 = new FilledRectangle();
        r3.getColor(); */

    }

}

interface Inter {
    int inter1();
}

/*
 * class A implements Inter { private int inter1() { return 7; } }
 */

abstract class B implements Inter {
}

/*
 * class C implements Inter { public double inter1() { return 7; } }
 */

class Person {
    private String name;

    public Person(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }
}

class OldLady extends Person {
    private int age;

    public OldLady(String nm, int yrs) {
        super(nm);
        age = yrs;
    }

    public String getName() {
        return "Mrs. " + super.getName();
    }

    public int getAge() {
        return age;
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // postcondition: returns the height
    public double getHeight() {
        return height;
    }

    // postcondition: returns the width
    public double getWidth() {
        return width;
    }
}

class FilledRectangle extends Rectangle {
    private String color;

    public FilledRectangle() {
        color = "red";
    }

    public FilledRectangle(double w, double h, String c, boolean test) {
        super(w, h);
        color = c;
    }

    /*
     * public FilledRectangle (double w, double h, String c) { width = w; height =
     * h; color = c; }
     */

    public String getColor() {
        return color;
    }
}
