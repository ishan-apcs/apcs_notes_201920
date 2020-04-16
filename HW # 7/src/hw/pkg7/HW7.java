/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg7;

/**
 *
 * @author ishanmadan
 */
public class HW7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        p1(4);
    }
    
    public static void p1 (int n) {
        if (n > 1) {
            p1(n-1);
            System.out.print(n);
            p1(n-1);
        }
    }
}
