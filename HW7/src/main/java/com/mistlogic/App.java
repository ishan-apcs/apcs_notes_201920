package com.mistlogic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num = 12321;
        // 1
        if (num % 3 == 0 && num % 5 == 0) 
        { 
        System.out.println("evenly divisible by 15"); 
        } 
        else 
        { 
        System.out.println("not evenly divisible by 15"); 
        }

        // 2

        if (num % 15 == 0) {
            System.out.println("evenly divisible by 15"); 
        } else { 
            System.out.println("not evenly divisible by 15"); 
        }

        // 3

        if (num % 5 == 0) {
            System.out.println("multiple of 5");
        }

        // 4

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // 5

        if (num % 24 == 0) {
            System.out.println(num + "doesn’t meet");
        } else if (num % 3 == 0) {
            System.out.println(num + "meets");
        } else {
            System.out.println(num + "doesn’t meet");
        }

        // 6

        String first = "testing";
        String second = "success!";

        try {
            if (first.equals(second)) {}
        } catch (Exception e) {
            System.out.println("One of your strings is empty! :(");
        }
        
        if (first.compareTo(second) < 0) {
            System.out.println(first + "\n" + second);
        } else if (first.compareTo(second) > 0) {
            System.out.println(second + "\n" + first);
        } else {
            System.out.println(first + "\n" + second + " They’re equal");
        }

        // 7

        if (num % 2 == 0) {
            System.out.println("ones digit is even");
        }

        // 8

        if ((int)(num*10) % 2 != 0) {
            System.out.println("tens digit is odd");
        }

        // 9

        if ((int)(num*100) % 5 == 0 && (int)(num*100) % 2 != 0) {
            System.out.println("hundreds digit is 5");
        }

        // 10

        if (((int)(num*1000) - 3) % 10 == 10) {
            System.out.println("thousands digit is 3");
        }

        // 11

        if (Integer.toString(num).compareTo(new StringBuilder(Integer.toString(num)).reverse().toString()) == 0) {
            System.out.println("num is a palindrome");
        } else {
            System.out.println("num is not a palindrome");
        }

        // 12

        for (int i = 1; i <= 5; i++) 
        {
        System.out.print(i + " "); 
        }
    }
}
