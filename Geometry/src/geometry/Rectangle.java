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
public class Rectangle extends RegularShape {
    private double length;
    private double width;
    
     
    public Rectangle(double inLength, double inWidth) {
        length = inLength;
        width = inWidth;
    }
   
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }
    
    
    public void setLength(double inLength) {
        length = inLength;
    }
    
    public void setWidth(double inWidth) {
        width = inWidth;
    }
    
    public double setLength() {
        return length;
    }
    
    public double setWidth() {
        return width;
    }
    
    public double getArea() {
        return (length*width);
    }
    
    public double getPerimeter() {
        return 2*(length+width);
    }
    
    public boolean isSquare() {
        return(length == width);
    }
    
    public String toString() {
        return String.format("%.2f, %.2f", length, width);
    }
    
}
