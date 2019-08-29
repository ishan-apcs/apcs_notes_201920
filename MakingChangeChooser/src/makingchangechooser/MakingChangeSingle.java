/**
 * @author ishanmadan
 * 
 * My program will allow users to choose a menu order or make their own order. they will then either 
 * tell the price of their own order or automatically get a price from the menu, and will have to pay 
 * it. The program calculates how much change they should get back, and gives it to them in tens, fives,
 * ones, quarters, dimes, nickels, and pennies.
 */
package makingchangechooser;
import java.util.Scanner;

public class MakingChangeSingle {
    
    public static void singleOrder(Scanner input) {
        // TODO code application logic here
        String name;
        String menuOrNo;
        
        // Welcome to cafe
        
        System.out.println("Would you like to see our menu? Please answer yes or no.");
        menuOrNo = input.nextLine();
        // check reply, force user to either reply yes or no if not done already
        menuOrNo = menuOrNo.toLowerCase();
        menuOrNo = menuOrNo.replaceAll("[^yesno]","").toString();    
        while (!(menuOrNo.equals("yes") || menuOrNo.equals("no"))) {
            System.out.println("Sorry, that's neither yes nor no.\nWould you like to see our menu? Please answer yes or no.");
            menuOrNo = input.nextLine();
            menuOrNo = menuOrNo.toLowerCase();
            menuOrNo = menuOrNo.replaceAll("[^yesno]","").toString();
        }
        if (menuOrNo.equals("yes")) {
            yesMenu(input); // run code for menu
        } else if (menuOrNo.equals("no")) {
            noMenu(input); // run code to build own order
        }
        
    }
    
    public static void yesMenu(Scanner input) {
        
        String menu;
        String order;
        
        double price;
        
        price = 0.00;
        menu = MakingChangeChooser.menu();
        
        System.out.println("Here's our menu:"); // print menu, get order back
        System.out.println(menu);
        System.out.println("Please enter your order. If you don't find anything that appeals to your tastes on our menu, you can just order something else by saying \"something else\".");
        order = input.nextLine();
        order = order.toLowerCase();
        
        switch (order) { // find correct price for order
            case "sandwich":
                price = 4.99;
                break;
            case "burger":
                price = 4.99;
                break;
            case "hot dog":
                price = 4.99;
                break;
            case "french fries":
                price = 2.99;
                break;
            case "donut":
                price = 1.99;
                break;
            case "mocha":
                price = 2.99;
                break;
            case "latte":
                price = 2.99;
                break;
            case "iced coffee":
                price = 2.99;
                break;
            case "coffee":
                price = 2.49;
                break;
            case "iced tea":
                price = 1.99;
                break;
            case "chai latte":
                price = 1.99;
                break;
            case "green tea":
                price = 1.99;
                break;
            case "black tea":
                price = 1.99;
                break;
            case "soda":
                price = 0.99;
                break;
            case "water":
                price = 0.99;
                break;
            case "juice":
                price = 0.99;
                break;
            case "something else": // allow user to change their mind and create their own order
                noMenu(input); // go to create own order
                System.exit(0); // end program
                break;
            default: // forces user to pick something on the menu or indicate that they want to build their own order
                System.out.println("Sorry, that's not on the menu.");
                yesMenu(input); // restart menu program
                System.exit(0); // end program
        }
        
        MakingChangeChooser.checkout(input, price);
    }
    
    public static void noMenu(Scanner input) {
        String item;
        
        double price;
        
        System.out.println("What are you buying today?");
        item = input.nextLine();
        
        System.out.println("That's awesome! How much does that cost? The dollar sign is optional."); // get price
        price = MakingChangeChooser.removeDollarSign(input.nextLine());
        
        while (price * 100 != (Math.floor(100 * price))) {
            System.out.println("Sorry, all our prices are to two decimal places."); // make sure price has only 2 decimal places
            price = MakingChangeChooser.removeDollarSign(input.nextLine());
        }
        
        MakingChangeChooser.checkout(input, price);
    }
}