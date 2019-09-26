/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

/**
 *
 * @author ishanmadan
 */
public class BouncingBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // A bouncing ball simulation
        int x = 50, y = 50, dy = 0;

        while (true) {
            while (x < 480) {
                // Start one frame of the animation.
                Window.frame();

                // Draw the ball.
                Window.out.background("white");
                Window.out.color("red");
                Window.out.circle(x, y, 20);

                // Move the ball.
                x = x + 3;
                y = y + dy;
                dy = dy + 1;

                // Bounce the ball.
                if (y > 480) {
                    y = 480;
                    dy = dy * -9 / 10;
                }
            }
            x = 50;
            y = 50;
            dy = 0;
        }
    }
    
}
