/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frq1;

/**
 *
 * @author ishanmadan
 */
public class FRQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isSelfDivisor(1234567890));
    }
    
    public static boolean isSelfDivisor(int number) {
        int size = 0;
        
        while (number % Math.pow(10,size) != number) {
            size++;
        }
        
        int[] digits = new int[size];
        int anumber = number;
        
        for (int i = 0; i < digits.length; i++) {
            digits[i] = anumber % 10;
            anumber /= 10;
        }
        
        for (int j : digits) {
            if (j == 0 || number % j != 0)
                return false;
        }
        
        return true;
    }
    
}
