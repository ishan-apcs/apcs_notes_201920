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
        checkout(input, totalPrice);
        
    }
    
    public static String menu() { // text for the menu (it was too big to put inside yesMenu())
        return "MMMMMMMM               MMMMMMMMEEEEEEEEEEEEEEEEEEEEEENNNNNNNN        NNNNNNNNUUUUUUUU     UUUUUUUU\n" +
"M:::::::M             M:::::::ME::::::::::::::::::::EN:::::::N       N::::::NU::::::U     U::::::U\n" +
"M::::::::M           M::::::::ME::::::::::::::::::::EN::::::::N      N::::::NU::::::U     U::::::U\n" +
"M:::::::::M         M:::::::::MEE::::::EEEEEEEEE::::EN:::::::::N     N::::::NUU:::::U     U:::::UU\n" +
"M::::::::::M       M::::::::::M  E:::::E       EEEEEEN::::::::::N    N::::::N U:::::U     U:::::U \n" +
"M:::::::::::M     M:::::::::::M  E:::::E             N:::::::::::N   N::::::N U:::::D     D:::::U \n" +
"M:::::::M::::M   M::::M:::::::M  E::::::EEEEEEEEEE   N:::::::N::::N  N::::::N U:::::D     D:::::U \n" +
"M::::::M M::::M M::::M M::::::M  E:::::::::::::::E   N::::::N N::::N N::::::N U:::::D     D:::::U \n" +
"M::::::M  M::::M::::M  M::::::M  E:::::::::::::::E   N::::::N  N::::N:::::::N U:::::D     D:::::U \n" +
"M::::::M   M:::::::M   M::::::M  E::::::EEEEEEEEEE   N::::::N   N:::::::::::N U:::::D     D:::::U \n" +
"M::::::M    M:::::M    M::::::M  E:::::E             N::::::N    N::::::::::N U:::::D     D:::::U \n" +
"M::::::M     MMMMM     M::::::M  E:::::E       EEEEEEN::::::N     N:::::::::N U::::::U   U::::::U \n" +
"M::::::M               M::::::MEE::::::EEEEEEEE:::::EN::::::N      N::::::::N U:::::::UUU:::::::U \n" +
"M::::::M               M::::::ME::::::::::::::::::::EN::::::N       N:::::::N  UU:::::::::::::UU  \n" +
"M::::::M               M::::::ME::::::::::::::::::::EN::::::N        N::::::N    UU:::::::::UU    \n" +
"MMMMMMMM               MMMMMMMMEEEEEEEEEEEEEEEEEEEEEENNNNNNNN         NNNNNNN      UUUUUUUUU      \n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"				  ______                 _ \n" +
"				 |  ____|               | | _ \n" +
"				 | |__  ___    ___    __| |(_)\n" +
"				 |  __|/ _ \\  / _ \\  / _` |   \n" +
"				 | |  | (_) || (_) || (_| | _ \n" +
"				 |_|   \\___/  \\___/  \\__,_|(_)\n" +
"\n" +
"					Sandwich $4.99\n" +
"					Burger $4.99\n" +
"					Hot Dog $4.99\n" +
"					French Fries $2.99\n" +
"					Donut $1.99\n" +
"\n" +
"\n" +
"\n" +
"			      _____         __   __\n" +
"			     / ____|       / _| / _|            _ \n" +
"			    | |      ___  | |_ | |_  ___   ___ (_)\n" +
"			    | |     / _ \\ |  _||  _|/ _ \\ / _ \\   \n" +
"			    | |____| (_) || |  | | |  __/|  __/ _ \n" +
"			     \\_____|\\___/ |_|  |_|  \\___| \\___|(_)\n" +
"\n" +
"\n" +
"					Mocha $2.99\n" +
"					Latte $2.99\n" +
"					Iced Coffee $2.99\n" +
"					Coffee $2.49\n" +
"\n" +
" 				     _______\n" +
" 				    |__   __|           _ \n" +
" 				       | |  ___   __ _ (_)\n" +
" 				       | | / _ \\ / _` |   \n" +
" 				       | ||  __/| (_| | _ \n" +
" 				       |_| \\___| \\__,_|(_)\n" +
"\n" +
"\n" +
"					Iced Tea $1.99\n" +
"					Chai Latte $1.99\n" +
"					Green Tea $1.99\n" +
"					Black Tea $1.99\n" +
"\n" +
"		   ____   _    _                   _____         _         _\n" +
"		  / __ \\ | |  | |                 |  __ \\       (_)       | |         _ \n" +
"		 | |  | || |_ | |__    ___  _ __  | |  | | _ __  _  _ __  | | __ ___ (_)\n" +
"		 | |  | || __|| '_ \\  / _ \\| '__| | |  | || '__|| || '_ \\ | |/ // __|   \n" +
"		 | |__| || |_ | | | ||  __/| |    | |__| || |   | || | | ||   < \\__ \\ _ \n" +
"		  \\____/  \\__||_| |_| \\___||_|    |_____/ |_|   |_||_| |_||_|\\_\\|___/(_)\n" +
"\n" +
"					Soda $0.99\n" +
"					Water $0.99\n" +
"					Juice $0.99";
    }
    
    public static double yesMenu(Scanner input) {
        
        String menu;
        String order;
        
        double price;
        
        price = 0.00;
        menu = menu();
        
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
        price = removeDollarSign(input.nextLine());
        
        while (price * 100 != (Math.floor(100 * price))) {
            System.out.println("Sorry, all our prices are to two decimal places."); // make sure price has only 2 decimal places
            price = removeDollarSign(input.nextLine());
        }
        
        return price;
    }
    
    public static void checkout(Scanner input, double price) {
        double amountGiven;
        double total;
        System.out.println(price);
        System.out.println(price * 100);
        System.out.println(price * 100 * 1.0925);
        System.out.println(Math.round(price * 100 * 1.0925));
        System.out.println((double)(Math.round(price * 100 * 1.0925)) / 100);
        total = (double)(Math.round(price * 100 * 1.0925)) / 100;
        
        System.out.println("Your total today is $" + total + ". How much are you going to pay?"); // check for payment
        amountGiven = removeDollarSign(input.nextLine());
        
        while (amountGiven < price) { // make sure payment covers price
            System.out.println("Sorry, that's not enough to cover $" + total + ". Please enter an amount of money that covers the cost.");
            amountGiven = removeDollarSign(input.nextLine());
        
            while (amountGiven * 100 != (Math.floor(100 * amountGiven))) {
                System.out.println("Sorry, we can't accept any more than two decimal places");
                amountGiven = removeDollarSign(input.nextLine());
            }
        }
        
        getChange(price, amountGiven); // print change, given price and payment
    }
    
    public static void getChange(double price, double amountGiven) {
        double change;
        double origChange;
        
        int tens;
        int fives;
        int ones;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        
        change = amountGiven - price;
        
        if (change * 100 != (Math.floor(100 * change))) { // check to make sure change is a decimal with 2 places
            change = (double)(Math.round(change * 100)) / 100;// make change a decimal with 2 places
        }
        
        origChange = change;
        
        change *= 100; //allows getChangeForUnit function to use ints instead of doubles, since doubles are inherently bad in math
        
        tens = getChangeForUnit((int)change, 10); // get number of tens, then subtract that much money from change, etc
        change -= (tens * 1000);
        fives = getChangeForUnit((int)change, 5);
        change -= (fives * 500);
        ones = getChangeForUnit((int)change, 1);
        change -= (ones * 100);
        quarters = getChangeForUnit((int)change, 0.25);
        change -= (quarters * 25);
        dimes = getChangeForUnit((int)change, 0.1);
        change -= (dimes * 10);
        nickels = getChangeForUnit((int)change, 0.05);
        change -= (nickels * 5);
        pennies = getChangeForUnit((int)change, 0.01);
        change -= (pennies * 1);
        
        if (change >= 0.01) {
            System.out.println("Sorry, our cash register is encountering technical difficulties. Your change might not be accurate. Our apologies. Diagnostics:" + change);
        }
        
        String print;
        
        print = "";
        
        if (origChange != 0) {
            print += ("Here's your change: $" + origChange + " ("); // print amount of change given, plus units
        
            if (tens == 1) {
                print += checkIfCommaNeeded(print);
                print += ("1 ten");
            } else if (tens > 1) {
               print += checkIfCommaNeeded(print);
               print += (tens + " tens");
            }

            if (fives == 1) {
                print += checkIfCommaNeeded(print);
                print += ("1 five");
            } else if (fives > 1) {
                print += checkIfCommaNeeded(print);
                print += (fives + " fives");
            }

            if (ones == 1) {
                print += checkIfCommaNeeded(print);
                print += ("1 one");
            } else if (ones > 1) {
                print += checkIfCommaNeeded(print);
                print += (ones + " ones");
            }

            if (quarters == 1) {
                print += checkIfCommaNeeded(print);
                print += ("1 quarter");
            } else if (quarters > 1) {
                print += checkIfCommaNeeded(print);
                print += (quarters + " quarters");
            }

            if (dimes == 1) {
                print += checkIfCommaNeeded(print);
                print += ("1 dime");
            } else if (dimes > 1) {
                print += checkIfCommaNeeded(print);
                print += (dimes + " dimes");
            }

            if (nickels == 1) {
                print += checkIfCommaNeeded(print);
                print += ("1 nickel");
            } else if (nickels > 1) {
                print += checkIfCommaNeeded(print);
                print += (nickels + " nickels");
            }

            if (pennies == 1) {
                print += checkIfCommaNeeded(print);
                print += ("1 penny");
            } else if (pennies > 1) {
                print += checkIfCommaNeeded(print);
                print += (pennies + " pennies");
            }

            print += ("). ");
        }
        
        print += ("Thank you for shopping at the Foo Bar. See you again soon!");
        
        System.out.println(print);
    }
    
    public static int getChangeForUnit(double change, double unit) {
        
        int unitToCheck = (int)(unit * 100); // allows swich statement to compare ints instead of doubles
        
        switch (unitToCheck) { // checks by cent amount, not dollar amount (ex. nickel is 5 instead of 0.05)
            case 1000: // tens
                return (int)((change - (change % 1000)) / 1000);
            case 500: // fives
                return (int)((change - (change % 500)) / 500);
            case 100: // ones
                return (int)((change - (change % 100)) / 100);
            case 25: // quarters
                return (int)((change - (change % 25)) / 25);
            case 10: // dimes
                return (int)((change - (change % 10)) / 10);
            case 5: // nickels
                return (int)((change - (change % 5)) / 5);
            case 1: // pennies
                return (int)((change - (change % 1)) / 1);
            default:
                System.out.println("getChangeForUnit unit error");
                return 0;
        }
    }
    
    public static double removeDollarSign(String text) { // remove any unnecessary text from inputs
        text = text.replaceAll("[^0-9.]", ""); // remove anything that's not a digit or a decimal
        double money = Double.parseDouble(text); // turn the string into a double and return the amount of money
        return money;
    }
    
    public static String checkIfCommaNeeded(String print) { // check if comma is needed when concatenating list of bills/coins in change
        if (print.toCharArray()[print.length() - 1] != '(') { //if the last character isn't an opening parenthesis, (meaning there's another term before this one) add a comma
            return ", ";
        } else {
            return "";
        }
    }
}