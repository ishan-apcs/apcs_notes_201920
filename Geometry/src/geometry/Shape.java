/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author dot
 */

public interface Shape {
    
    public void setColor(String inColor);    
    public abstract double getPerimeter();
    public abstract double getArea();

}