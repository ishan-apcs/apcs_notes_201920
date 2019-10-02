/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg8;

import java.util.Scanner;

/**
 * @author ishanmadan
 */
public class HW8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;  
        for (int i = 5; i > 0; i--) { 
            if (i % 2 == 1) num += i; 
        }
        System.out.println(num);

//        for (int i = 0; i < 6; i = (i + 2) / 2) 
//            System.out.print(i + 1); // no space
        
        for (int i = 1; i < 10; i+=2) {
            for (int j = 0; j < (11-i)/2; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i);
            }
            for (int l = 0; l < (11-i)/2; l++) {
                System.out.print("-");
            }
            System.out.println("");
        }
        
        for (int i = 9; i > 0; i-=2) {
            for (int j = 0; j < (11-i)/2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < (11-i)/2; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        for (int i = 1; i < 10; i+=2) {
            for (int j = 0; j < (11-i)/2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < (11-i)/2; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to stop at? There are no safeguards, so if you break the code it's your fault.");
        int end = input.nextInt();
        int product;
        for (int i = end; i >= 0; i--) {
            product = 1;
            for (int j = end; j > 1; j--) {
                product *= j;
            }
            end = i - 1;
            System.out.println(i + "! = " + product);
        }
        main2();
        
        for(int c = 1; c <= 16; c++) {
            for (int r = 1; r <= 16; r ++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static final int MAX_ODD = 21;
    public static void main2() 
    {	// print each odd number
        int count;
        for (count = 1; count <= (MAX_ODD - 2); count++) {
            System.out.println(count + " ");
            count = count + 2;
        }

        // print the last odd number
        System.out.println(count + 2);
        }
    
}
