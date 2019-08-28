package makingchangechooser;

import java.util.Scanner;

/**
 *
 * @author ishanmadan
 * 
 * My project will ask the user whether they want to buy a single or multiple items, then start the appropriate program. Either program will offer a menu, or a build-your-own order option, then get the item(s) they want to purchase. Menu options will already have
 * a price built in, build-your-own orders will ask for the price. Both programs will then ask for payment, and then return change in tens, fives, ones, quarters, dimes, nickels, and pennies, and build a print statement declaring these to the user.
 */
public class MakingChangeChooser {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input;
        
        String name;
        String chooser;
        
        input = new Scanner(System.in);
        	
        System.out.println("Welcome to the Foo Bar! What's your name?"); // get user's name for next question
        name = input.nextLine();
        
        System.out.println("Hi " + name + "! Would you like to make a single order or multiple? Please answer \"single\" or \"multiple\"."); // check whether to run MakingChangeMultiple or MakingChangeSingle
        chooser = input.nextLine();
        chooser = chooser.toLowerCase();
        chooser = chooser.replaceAll("[^singlemutp]","").toString(); // make sure answer is acceptable
        while (!(chooser.equals("single") || chooser.equals("multiple"))) {
            System.out.println("Sorry, that's neither single nor multiple.\nWould you like to make a single order or multiple? Please answer \"single\" or \"multiple\".");
            chooser = input.nextLine();
            chooser = chooser.toLowerCase();
            chooser = chooser.replaceAll("[^singlemutp]","").toString();
        }
        if (chooser.equals("single")) {
            MakingChangeSingle.singleOrder(input); // run code for single order
        } else if (chooser.equals("multiple")) {
            MakingChangeMultiple.multiOrder(input); // run code for multiple orders
        }
        
    }
}
