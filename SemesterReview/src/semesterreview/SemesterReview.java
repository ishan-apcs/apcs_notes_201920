/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterreview;

/**
 *
 * @author ishanmadan
 */
public class SemesterReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        problem3();
        System.out.println("asdf".substring(2,3));
    }

    public static void problem3() {
        int n = 2005;
        for (int i = 0; i < 50; i++)
            n = (n + 3) / 2;
        System.out.println(n);
    }

    public static void problem14() {
        int j = 0;
        int n = 10;

        while ( j < n ); // mistaken semicolon
        {
        System.out.println("in loop");
        j++;
        }

    }

    public static void problem4() {
        int sum = 0, p = 1;
        for (int count = 1; count <= 50; count++) {
            sum += p;
            p *= 2;
        }
        int x = Integer.MAX_VALUE;
        x += 1;
        x -= 2;
        System.out.println(p);
    }
    
}
