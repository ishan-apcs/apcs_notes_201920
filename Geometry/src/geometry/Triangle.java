/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Sebek
 */
public class Triangle  extends RegularShape {
    private double s1;
    private double s2;
    private double s3;
    
    public Triangle() {
        s1 = 1.0;
        s2 = 1.0;
        s3 = 1.0;
    }
    
    public Triangle(double side1, double side2, double side3) {
        s1 = side1;
        s2 = side2;
        s3 = side3;
    }
    
    public double getSide1() {
        return s1;
    }
    
    public double getSide2() {
        return s2;
    }
    
    public double getSide3() {
        return s3;
    }
    
    public double getSide(int side) {
        if(side == 1) {
            return s1;
        } else if(side == 2) {
            return s2;
        } else if(side == 3) {
            return s3;
        } else {
            return -1;
        }
    }
    
    public double getArea() {
        //
        double halfArea = 0, area = 0;
        halfArea = .5*getPerimeter();
        area = Math.sqrt(halfArea*(halfArea-s1)*(halfArea-s2)*(halfArea-s3));
        return area;   
    }

    public double getPerimeter() {
        return (s1 + s2 + s3);
    }
}