/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathy;

/**
 *
 * @author ishanmadan
 */
public class Mathy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean billy = true; // = false; both are valid
        boolean joe;
        double joesAssistant;
        int bob, sara; // any integer positive or negative
        double sandra = 3.2; // any number that's a decimal
        String silly = "hi"; // any string can be saved here
        String silly2;
        
        joesAssistant = Math.random();
        if (joesAssistant >= 0.5) {
            joe = true;
        } else {
            joe = false;
        }
        
        sara = boolToInt(billy);
        
        bob = boolToInt(joe);
        
        silly = Integer.toString(bob);
        silly += " ";
        silly += joesAssistant;
        
        silly2 = "" + sara;
        
        System.out.println(silly);
        System.out.println(silly2);
    }
    
    public static int boolToInt(boolean bool) {
        if (bool == true) {
            return (int)1;
        } else {
            return 0;
        }
    }
    
}
