/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg10;

/**
 *
 * @author ishanmadan
 */
public class HW10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rightTriangle(5);

        System.out.println();
        
        upsideDownRightTriangle(5);
        
        System.out.println();
        
        differentRightTriangle(5);
        
        System.out.println();
        
        differentUpsideDownRightTriangle(5);
        
        System.out.println();
        
        nonRightIsocelesTriangle(9);
        
        System.out.println();
        
        rightNumberTriangle(5);
        
        System.out.println();
        
        shiftedNumbers(5);
        
        System.out.println();
        
        dashedNumberTriangle(10);

    }
    
    public static void rightTriangle(int max) {
        for (int i = 1; i <= max; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void upsideDownRightTriangle(int max) {
        for (int i = max; i >=1; i--) {
            for (int j = 0; j <= (max-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void differentRightTriangle(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j <= (max-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void differentUpsideDownRightTriangle(int max) {
        for (int i = max; i >=1; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void nonRightIsocelesTriangle(int max) {
        for (int i = max; i > 0; i-=2) {
            for (int j = 0; j < (max+2-i)/2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void rightNumberTriangle(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public static void shiftedNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max-i; j++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }

    public static void dashedNumberTriangle(int max) {
        for (int i = 1; i < max; i+=2) {
            for (int j = 0; j < (max+1-i)/2; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i);
            }
            for (int l = 0; l < (max+1-i)/2; l++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}
