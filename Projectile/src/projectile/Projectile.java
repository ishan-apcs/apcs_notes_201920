/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectile;

import apcs.Window;

/**
 *
 * @author ishanmadan
 */
public class Projectile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Window.size(1280, 720);
        
        // A bouncing ball simulation
        int x = 20;
        int y = Window.height() - 20;
        int d = 30;
        int aDegree = 75;
        double aRad = aDegree * Math.PI/180;
        int dy = -(int)(d * Math.sin(aRad));
        int dx = (int)(d * Math.cos(aRad));
        while (true) {
            // Start one frame of the animation.
            Window.frame();
            
            // Draw the ball.
            Window.out.background("white");
            Window.out.color("red");
            Window.out.circle(x, y, 20);

            // Move the ball (y).
            y += dy;
            
            // Stop the ball.
            if (y > Window.height() - 20) {
                y = Window.height() - 20;
                dy = 0;
                dx = 0;
            }
            
            // Move the ball (x), change the y velocity.
            x += dx;
            dy += 1;
            /*x += 3;
            y += dy;
            dy += 1;*/

            
        }
        
    }
    
}
