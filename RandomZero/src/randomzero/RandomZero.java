/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomzero;

/**
 *
 * @author ishanmadan
 */
public class RandomZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double result = 1;
        int count = 0;
        while (result != 0) {
            count++;
            result = Math.random();
            System.out.println(count);
        }
        
    }
    
}
