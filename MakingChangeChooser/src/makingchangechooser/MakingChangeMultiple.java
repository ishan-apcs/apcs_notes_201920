package makingchangechooser;
import java.util.Scanner;

/**
 * @author ishanmadan
 */

public class MakingChangeMultiple {
    
    public static void multiOrder(Scanner input) {
        String menuOrNo;
        String goToCheckout = "";
        
        double totalPrice = 0.0;
        double tempPrice;
        
        while (!goToCheckout.equals("yes")) { // while user still wants to add more items
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
                tempPrice = yesMenu(input);
                totalPrice += tempPrice; // run code for menu
            } else if (menuOrNo.equals("no")) {
                tempPrice = noMenu(input); // run code to build own order
                totalPrice += tempPrice;
            } else {
                System.out.println("input error");
                System.exit(0);
            }
            System.out.println("Your subtotal is $" + totalPrice + ".");
            // ask user if they want to continue adding items or if they want to go to checkout()
            System.out.println("Would you like to check out now? Please answer yes to check out or no to continue adding items to your order.");
            goToCheckout = input.nextLine();
            goToCheckout = goToCheckout.replaceAll("[^yesno]","").toString();    
            while (!(goToCheckout.equals("yes") || goToCheckout.equals("no"))) { // clean up answer, ensure it's "yes" or "no"
                System.out.println("Sorry, that's neither yes nor no.\nWould you like to check out now? Please answer yes or no.");
                goToCheckout = input.nextLine();
                goToCheckout = goToCheckout.toLowerCase();
                goToCheckout = goToCheckout.replaceAll("[^yesno]","").toString();
            }
        }
        MakingChangeChooser.checkout(input, totalPrice);
        
    }
    
    public static double yesMenu(Scanner input) {
        
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
                return noMenu(input); // create their own order
            default: // Sends user back to multiOrder()
                System.out.println("Sorry, that's not on the menu.");
                return 0.0;
        }
        
        return price;
        
    }
    
    public static double noMenu(Scanner input) {
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
        
        return price;
    }
}