/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpractice;

/**
 *
 * @author ishanmadan
 */
public class StringPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String p = "potato is cool";
        System.out.println(p.equals("potato is cool"));
        System.out.println(p.length());
        System.out.println(p.length() + 6);
        System.out.println(p.indexOf("o"));
        System.out.println(p.substring(3));
        int i = 0;
        while (p.indexOf(i) < 0) {
            i++;
        }
        System.out.println(i);
        System.out.println(p.indexOf(i));
    }
    
}
