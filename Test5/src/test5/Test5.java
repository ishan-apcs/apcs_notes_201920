/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;

/**
 *
 * @author ishanmadan
 */
public class Test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println(replaceOne("abcdefghijklmnopqrstuvwxyz", 10, 3, "sub"));
        System.out.println(replaceAll("AABBCCDDAABBSCSLDFAA", "AA", "B"));
    }

    public static String replaceOne(String text, int i, int n, String sub) {
        String string1 = text.substring(0, i);
        String string2 = sub;
        String string3 = text.substring(i+n);

        return string1 + string2 + string3;
    }

    public static String replaceAll(String text, String x, String sub) {
        while (text.indexOf(x) != -1) {
            text = replaceOne(text, text.indexOf(x), x.length(), sub);
        }
        return text;
    }
    
}
