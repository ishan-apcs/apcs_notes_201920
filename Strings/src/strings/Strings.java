/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author ishanmadan
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        alphabet = alphabet.replaceAll("a", "@");
        
        System.out.println(alphabet);
    }
    
}
