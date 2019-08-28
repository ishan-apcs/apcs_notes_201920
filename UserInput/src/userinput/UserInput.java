/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.Scanner;

/**
 *
 * @author ishanmadan
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInputScanner = new Scanner(System.in);
        String name = "";
        
        while (!(name.toLowerCase().equals("andrew "))) {
            System.out.println("\nWhat is your name? ");
            name = userInputScanner.nextLine();
            System.out.println("Access Denied");
            
        }
        int numInt;
        double numDouble;
        boolean boolIn;
        String stringIn;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("int");
        numInt = input.nextInt();
        try {
            System.out.println(numInt);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("double");
        numDouble = input.nextDouble();
        try {
            System.out.println(numDouble);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("bool");
        boolIn = input.nextBoolean();
        try {
            System.out.println(boolIn);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("string");
        stringIn = input.next();
        try {
            System.out.println(stringIn);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
