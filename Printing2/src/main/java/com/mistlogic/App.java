package com.mistlogic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String blank;
        int num = 12321;

        System.out.println( "Hello World!" );
        System.out.println("".compareTo("text"));
        System.out.println("text".compareTo(""));
        System.out.println("".compareTo(""));
        // System.out.println(blank.compareTo("text"));
        // System.out.println("text".compareTo(blank));
        // System.out.println(blank.compareTo(""));
        // System.out.println("".compareTo(blank));
        
        if (Integer.toString(num).compareTo(Integer.toString(num)) == 0) {
            System.out.println("num is a palindrome");
        } else {
            System.out.println("num is not a palindrome");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " "); 
        }

    }
}
