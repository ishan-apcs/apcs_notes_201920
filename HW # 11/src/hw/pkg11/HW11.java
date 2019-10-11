/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg11;

import java.util.Scanner;

/**
 *
 * @author ishanmadan
 */
public class HW11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(gcd(18, 24));
        System.out.println(piApprox(1000));
        System.out.println(reverse("hello there!"));
        reverseNum();
        System.out.println(reverse(5803));
        System.out.println(checkPrime2(127));
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array that is to be created:");
        int size = scanner.nextInt();
        
        double[] array = new double[size];
        
        System.out.println("Enter the " + size + " elements of the array:");
        
        
        for(int i=0; i<size; i++) {
            array[i] = scanner.nextDouble();
        }
        
        System.out.println(min(array));
        int[] array2;
    }
    
    public static double min(double[] array) {
        double result = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        
        return result;
    }
    
    public static boolean checkPrime2(int input) {        
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
            
            if (input % i == 0) {
                return false;
            }
        }
        
        System.out.println();
        
        return true;
    }
    
    public static boolean checkPrime(int input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int reverse(int input) {
        int result = input%10;
        
        while (input != 0) {
            input /= 10;
            result *= 10;
            result += input%10;
        }
        
        return result/10;
    }
    
    public static String reverse(String input) {
        String result = "";

        int length = input.length();

        if (length <= 0) {
            return "";
        }

        while (length - 1 >= 0) {
            result += input.substring(length - 1, length);
            length--;
        }

        return result;
    }

    public static void reverseNum() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer to reverse:");
        int intput = scanner.nextInt();
        
        String result = "";
            
        String input = "" + intput;

        int length = input.length();

        if (length <= 0) {
            System.out.println(0);
        }

        while (length - 1 >= 0) {
            result += input.substring(length - 1, length);
            length--;
        }

        System.out.println(Integer.parseInt(result));
    }

    public static double piApprox(int number) {
        double total = 0;
        double temp = 0;
        for (int i=1; i <= number; i++) {
                temp = 1/(i*2.0-1);
                if (i%2 == 0) {
                        total -= temp;
                } else {
                        total += temp;
                }
        }

        return 4*total;
    }

    public static int gcd(int num1, int num2) {
        int i = 1;
        int result = 1;
        while (i <= num1 && i <= num2) {
                if (num1%i == 0 && num2%i == 0) {
                        result = i;
                }
                i++;
        }
        return result;
    }
    
}
