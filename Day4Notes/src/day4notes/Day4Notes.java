/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4notes;

import java.util.Scanner;

/**
 *
 * @author ishanmadan
 */
public class Day4Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("'%.1f'", 10.3456);
        System.out.printf("'%.2f'", 10.3456);
        System.out.printf("'%8.2f'", 10.3456);
        System.out.printf("'%8.4f'", 10.3456);
        System.out.printf("'%08.2f'", 10.3456);
        System.out.printf("'%-8.2f'", 10.3456);
        
        System.out.println("\n");
        
        System.out.println(5 + 6);
        System.out.println(6 - 5);
        System.out.println(2 * 6);
        System.out.println(6 / 2);
        System.out.println(8 % 6);
        
        System.out.println("");
        
        int x;
        System.out.println(x = 5);
        System.out.println(x += 5);
        System.out.println(x -= 5);
        System.out.println(x *= 5);
        System.out.println(x /= 5);
        System.out.println(x %= 5);
        
        System.out.println("");
        
        x = 10;
        System.out.println(++x);
        System.out.println(x);
        x = 10;
        System.out.println(x++);
        System.out.println(x);
        x = 10;
        System.out.println(--x);
        System.out.println(x);
        x = 10;
        System.out.println(x--);
        System.out.println(x);
        
        System.out.println("");
        
        System.out.println(Math.pow(2,4));
        System.out.println(Math.abs(-8));
        System.out.println(Math.PI);

    }
    
}
