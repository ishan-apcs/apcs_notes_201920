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
public class Circle implements Shape{
    private double radius;
    private String color;
    
    public Circle()
    {
        radius = 1.0;
    }
    
    public Circle(double r)
    {
        radius = r;
    }        
    
    public void setColor(String inColor)
    {
        color = inColor;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
        
    public double getPerimeter()
    {
        return Math.PI * 2 * radius;
    }
}



