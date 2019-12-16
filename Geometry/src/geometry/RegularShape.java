/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author sebek
 * outline of all shapes
 */
public abstract class RegularShape implements Shape{
    private String color = "purple";
    
    public void setColor(String inColor) {
        color = inColor;
    }
    
    public abstract double getPerimeter();
    public abstract double getArea();
}


