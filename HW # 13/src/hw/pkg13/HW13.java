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

import java.util.Arrays;

public class HW13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* double[] array = {1, 2, 3, 0, 5, 3, 7, 2, 3};
        double[] newArray = removeDuplicates(array);
        
        for (double i : newArray) {
            System.out.println(i);
        } */
        
        String[] array2 = {"billy", "joe", "candice", "yuri", "alpha", "beta", "gamma", "delta", "epsilon"};
        for (String element : alphabetize(array2)) {
            System.out.println(element);
        }
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
    
    public static double[] removeElement(double[] array, double element) {
        double[] newArray = new double[array.length - 1];
        boolean removed = false;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                if (!removed) {
                    newArray[i] = array[i];
                } else {
                    newArray[i-1] = array[i];
                }
            } else {
                removed = true;
            }
        }
        
        return newArray;
    }

    public static double[] addElement(double[] array, double element, int position) {
        double[] newArray = new double[array.length + 1];
        boolean replaced = false;

        for (int i = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = element;
                replaced = true;
            } else {
                if (replaced) {
                    newArray[i] = array[i-1];
                } else {
                    newArray[i] = array[i];
                }
            }
        }

        return newArray;
    }

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        int temp;

        for (int i = 0; i < array.length; i++) {
            temp = array[array.length - 1 - i];
            newArray[i] = temp;
        }

        return newArray;
    }

    public static double[] removeDuplicates(double[] array) {
        double[] tempArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == findIndex(array, array[i])) {
                tempArray[i] = array[i];
            } else {
                tempArray[i] = 0;
            }
        }

        int count = 0;

        for (int i = 0; i < tempArray.length; i++) {
            if (!(tempArray[i] == 0 && array[i] != 0)) {
                count++;
            }
        }

        double[] newArray = new double[count];

        int offset = 0;

        for (int i = 0; i < tempArray.length; i++) {
            if (!(tempArray[i] == 0 && array[i] != 0)) {
                newArray[i + offset] = tempArray[i];
            } else {
                offset--;
            }
        }

        return newArray;
    }

    public static String[] alphabetize(String[] array) {
        // Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}