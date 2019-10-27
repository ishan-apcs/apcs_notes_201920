/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author ishanmadan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Object[] test = new Object[5];
        
        test[0] = 1;
        test[1] = 5.0;
        test[2] = "hi";
        test[3] = true;
        test[4] = new long[6];
        
        System.out.println(fibonacciNum(10));
        pascalsTriangle(10);
    }
    
    public static int fibonacciNum(int pos) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        
        if (pos < 0) {
            return -1;
        } else if (pos == 0) {
            return 0;
        } else if (pos == 1) {
            return 1;
        } else {
            for (int i = 2; i <= pos; i++) {
                num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
            }
            return num3;
        }
        
    }
    
    public static void pascalsTriangle(int n) {
       int[] previousRow;
       int[] currentRow = {1};
       printArray(currentRow);
       previousRow = currentRow;
       for (int i = 2; i <= n; i++) {
           currentRow = new int[i];
           currentRow[0] = 1;
           currentRow[i - 1] = 1;
           for (int j = 0; j <= i - 3; j++) {
               currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
           }
           printArray(currentRow);
           previousRow = currentRow;
       }
   }

   public static void printArray(int[] array) {
       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       System.out.println();
   }
}
