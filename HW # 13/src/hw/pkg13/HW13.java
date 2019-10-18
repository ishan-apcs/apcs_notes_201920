/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg13;

/**
 *
 * @author ishanmadan
 */
public class HW13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static double sumArrayFor(double[] array) {
        
        double total = 0;
        
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        
        return total;
    }
    
    public static double sumArrayForEach(double[] array) {
        
        double total = 0;
        
        for (double val : array) {
            total += val;
        }
        
        return total;
    }
    
    public static double arrayAvg(double[] array) {
        
        double total = 0;
        
        for (double val : array) {
            total += val;
        }
        
        return total / array.length;
    }
 
    public static boolean checkVal(double[] array, double checkVal) {
        
        for (double val : array) {
            if (val == checkVal) {
                return true;
            }
        }
        
        return false;
    }

    public static int findIndex(double[] array, double val) {
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static double[] duplicateArray(double[] array) {
        double[] array2 = new double[array.length];
        
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        
        return array2;
    }
    
}
