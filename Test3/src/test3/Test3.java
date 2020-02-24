/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author ishanmadan
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static String pigLatin(String input) {
        
        String first = input.substring(0,1);
        String rest = input.substring(1, input.length());
                
        return rest + first + "ay";
        
    }
    
    public static int sum(int num) {
        int total = 0;
        
        while (num > 0) {
            total += num;
            num--;
        }
        
        return total;
    }
    
}
