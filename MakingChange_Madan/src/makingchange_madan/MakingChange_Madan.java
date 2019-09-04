package makingchange_madan;

import java.util.Scanner;

/**
 *
 * @author ishanmadan
 * 
 * My project will ask the user whether they want to buy a single or multiple items, then start the appropriate program. Either program will offer a menu, or a build-your-own order option, then get the item(s) they want to purchase. Menu options will already have
 * a price built in, build-your-own orders will ask for the price. Both programs will then ask for payment, and then return change in tens, fives, ones, quarters, dimes, nickels, and pennies, and build a print statement declaring these to the user.
 */
public class MakingChange_Madan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) { // initial run function, starts rest of code
        // TODO code application logic here
        Scanner input; // define Scanner
        
        String name; // define name variable
        String chooser; // define variable for either single or multiple order(s)
        
        input = new Scanner(System.in); // initialize input as a Scanner
        	
        System.out.println("Welcome to the Foo Bar! What's your name?"); // ask for user's name
        name = input.nextLine(); // get user's name
        
        System.out.println("Hi " + name + "! Would you like to make a single order or multiple? Please answer \"single\" or \"multiple\"."); // ask whether to run MakingChangeMultiple or MakingChangeSingle
        chooser = input.nextLine(); // get answer - single or multiple
        chooser = chooser.toLowerCase(); // make answer lowercase to make checking easier
        chooser = chooser.replaceAll("[^singlemutp]",""); // remove all characters except those in "single" & "multiple"
        while (!(chooser.equals("single") || chooser.equals("multiple"))) { // repeat until answer is either "single" or "multiple"
            System.out.println("Sorry, that's neither single nor multiple.\nWould you like to make a single order or multiple? Please answer \"single\" or \"multiple\"."); // prompt for acceptable answer
            chooser = input.nextLine(); // get new answer
            chooser = chooser.toLowerCase(); // convert new answer to lowercase
            chooser = chooser.replaceAll("[^singlemutp]",""); // remove all characters except those in "single" & "multiple"
        }
        if (chooser.equals("single")) { // if single requested
            singleOrder(input); // run code for single order
        } else if (chooser.equals("multiple")) { // if multiple requested
            multiOrder(input); // run code for multiple orders
        }
        
    }
    
    public static void multiOrder(Scanner input) { // main method for multiple orders
        String menuOrNo; // string - whether or not user wants menu
        String goToCheckout = ""; // string - whether or not user wants to check out, starts at blank string so user can't checkout w/o buying anything
        
        double totalPrice = 0.0; // default total price
        double tempPrice; // temporary price (needed later)
        
        while (!goToCheckout.equals("yes")) { // repeat while user still wants to add more orders
            System.out.println("Would you like to see our menu? Please answer yes or no."); // ask if user wants to see menu
            menuOrNo = input.nextLine(); // check for reply
            menuOrNo = menuOrNo.toLowerCase(); // convert reply to lowercase to make checking answer easier
            menuOrNo = menuOrNo.replaceAll("[^yesno]",""); // remove any extra characters beyond yes & no
            while (!(menuOrNo.equals("yes") || menuOrNo.equals("no"))) { // repeat while answer is neither yes nor no
                System.out.println("Sorry, that's neither yes nor no.\nWould you like to see our menu? Please answer yes or no."); // ask for proper answer
                menuOrNo = input.nextLine(); // check for new answer
                menuOrNo = menuOrNo.toLowerCase(); // convert new answer to lowercase
                menuOrNo = menuOrNo.replaceAll("[^yesno]",""); // remove any extra characters beyond yes & no
            }

            if (menuOrNo.equals("yes")) { // if user wants to see menu
                tempPrice = yesMenu(input); // run menu code, price returned from user's selection
                totalPrice += tempPrice; // add price returned to total price of order
            } else if (menuOrNo.equals("no")) { // if user doesn't want menu
                tempPrice = noMenu(input); // run code to build own order, price returned from user's order
                totalPrice += tempPrice; // add price returned to total price of order
            } else {
                System.out.println("input error"); // if answer is neither yes nor no, code must have malfunctioned
                System.exit(0); // quit program
            }
            totalPrice *= 100; // convert totalPrice to cents
            totalPrice = round(totalPrice); // round totalPrice - no fractions of cents, account for java math errors
            totalPrice /= 100; // convert totalPrice back to dollars
            System.out.println("Your subtotal is $" + totalPrice + "."); // tell user subtotal
            System.out.println("Would you like to check out now? Please answer yes to check out or no to continue adding items to your order."); // ask user if they want to check out
            goToCheckout = input.nextLine(); // check for user's answer
            goToCheckout.toLowerCase(); // convert answer to lowercase
            goToCheckout = goToCheckout.replaceAll("[^yesno]",""); // remove unnecessary characters in answer
            while (!(goToCheckout.equals("yes") || goToCheckout.equals("no"))) { // if answer is neither yes nor no
                System.out.println("Sorry, that's neither yes nor no.\nWould you like to check out now? Please answer yes or no."); // ask for acceptable answer
                goToCheckout = input.nextLine(); // check for new answer
                goToCheckout = goToCheckout.toLowerCase(); // convert new answer to lowercase
                goToCheckout = goToCheckout.replaceAll("[^yesno]",""); // remove unnecessary characters in new anser
            }
        }
        checkout(input, totalPrice); // send user to checkout, give Scanner and totalPrice
        
    }
    
    public static void singleOrder(Scanner input) {
        String menuOrNo; // string - whether or not user wants menu
        
        
        double price = 0.0; // default total price
        
        System.out.println("Would you like to see our menu? Please answer yes or no."); // ask if user wants to see menu
        menuOrNo = input.nextLine(); // check for reply
        menuOrNo = menuOrNo.toLowerCase(); // convert reply to lowercase to make checking answer easier
        menuOrNo = menuOrNo.replaceAll("[^yesno]",""); // remove any extra characters beyond yes & no
        while (!(menuOrNo.equals("yes") || menuOrNo.equals("no"))) { // repeat while answer is neither yes nor no
            System.out.println("Sorry, that's neither yes nor no.\nWould you like to see our menu? Please answer yes or no."); // ask for proper answer
            menuOrNo = input.nextLine(); // check for new answer
            menuOrNo = menuOrNo.toLowerCase(); // convert new answer to lowercase
            menuOrNo = menuOrNo.replaceAll("[^yesno]",""); // remove any extra characters beyond yes & no
        }
            
        if (menuOrNo.equals("yes")) { // if user wants to see menu
            price = yesMenu(input); // run code for menu
        } else if (menuOrNo.equals("no")) { // if user doesn't want menu
            price = noMenu(input); // run code to build own order
        } else {
            System.out.println("input error"); // if answer is neither yes nor no, code must have malfunctioned
            System.exit(0); // quit program
        }
        
        checkout(input, price); // send user to checkout, give Scanner and price
    }
    
    public static String menu() { // ascii menu)
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
    
    public static double yesMenu(Scanner input) { // user wanted to see menu
        
        String menu; // menu ascii text
        String order; // user's order
        
        double price; // price for user's selection
        
        price = 0.00; // set price to default value of 0
        menu = menu(); // set menu to saved ascii menu text
        
        System.out.println("Here's our menu:"); // print menu
        System.out.println(menu); // print menu
        System.out.println("Please enter your order. If you don't find anything that appeals to your tastes on our menu, you can just order something else by saying \"something else\"."); // ask for order
        order = input.nextLine(); // check for user's order
        order = order.toLowerCase(); // send order to lowercase
        
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
                return noMenu(input); // create their own order, send back to singleOrder()
            default: // order not recognized
                System.out.println("Sorry, that's not on the menu."); // tell user that order isn't on menu
                return 0.0; // return value of 0 won't change totalPrice, sends user back to singleOrder()
        }
        
        return price; // return price from menu back to singleOrder()
        
    }
    
    public static double noMenu(Scanner input) {
        String item; // user's order
        
        double price; // price of user's order
        
        System.out.println("What are you buying today?"); // ask for order
        item = input.nextLine(); // check for order
        
        System.out.println("That's awesome! How much does that cost? The dollar sign is optional."); // ask for price of custom order
        price = removeDollarSign(input.nextLine()); // check for price of order, make acceptable value
        
        while ((!(price > 0)) || ((round(price * 10000) / 100) != (Math.floor(100 * price)))) { // repeat while price is unacceptable
            if (!(price > 0)) { // if price isn't greater than $0
                System.out.println("I'm sorry, nothing in life is free. Please enter a price greater than $0."); // ask for acceptable price
                price = removeDollarSign(input.nextLine()); // check for new price of order, make acceptable value
            }
            System.out.println(price * 100.0);
            System.out.println((Math.floor(100 * price)));
            if ((round(price * 10000) / 100) != (Math.floor(100 * price))) {  // make sure price has only 2 decimal places
                System.out.println("Sorry, all our prices are to two decimal places. Please enter a price that conforms to typical monetary standards."); // ask for acceptable price
                price = removeDollarSign(input.nextLine()); // check for new price of order, make acceptable value
            }
        }
        
        return price; // send price back to singleOrder()
    }
    
    public static void getChange(double price, double payment) { // takes price and payment, prints change in bills & coins and then ends program
        double change; // amount of change left to reimburse
        double origChange; // amount of change originally needed to reimburse
        
        int hundreds; // number of $100 bills
        int fifties; // number of $50 bills
        int twenties; // number of $20 bills
        int tens; // number of $10 bills
        int fives; // number of $5 bills
        int ones; // number of $1 bills
        int quarters; // number of quarters
        int dimes; // number of dimes
        int nickels; // number of nickels
        int pennies; // number of pennies
        
        change = payment - price; // define amount of change needed
        
        if ((round(change * 10000)/100) != (Math.floor(100 * change))) { // check to make sure change is a decimal with 2 places - if change had only 2 places, flooring change * 100 should still be change * 100; run code if not true
            change = (double)(round(change * 100)) / 100;// round change * 100 to get accurate change value in cents
        }
        
        origChange = change; // save original change value, change variable will be reduced soon
        
        change *= 100; //multiply change times 100 (converts to cents), allows getChangeForUnit function to use ints instead of doubles, since java is inherently bad at using floats
        change = round(change); // round change value just in case java math messed up, should have no effect
        
        hundreds = getChangeForUnit((int)change, 100); // get max number of hundreds possible in change value
        change -= (hundreds * 10000); // subtract however many hundreds user is given back (in cents)
        fifties = getChangeForUnit((int)change, 50); // get max number of fifties possible in change value
        change -= (fifties * 5000); // subtract however many fifties user is given back (in cents)
        twenties = getChangeForUnit((int)change, 20); // get max number of twenties possible in change value
        change -= (twenties * 2000); // subtract however many twenties user is given back (in cents)
        tens = getChangeForUnit((int)change, 10); // get max number of tens possible in change value
        change -= (tens * 1000); // subtract however many tens user is given back (in cents)
        fives = getChangeForUnit((int)change, 5); // get max number of fives possible in remaining change value
        change -= (fives * 500); // subtract however many fives user is given back (in cents)
        ones = getChangeForUnit((int)change, 1); // get max number of ones possible in remaining change value
        change -= (ones * 100); // subtract however many ones user is given back (in cents)
        quarters = getChangeForUnit((int)change, 0.25); // get max number of quarters possible in remaining change value
        change -= (quarters * 25); // subtract however many quarters user is given back (in cents)
        dimes = getChangeForUnit((int)change, 0.1); // get max number of dimes possible in remaining change value
        change -= (dimes * 10); // subtract however many dimes user is given back (in cents)
        nickels = getChangeForUnit((int)change, 0.05); // get max number of nickels possible in remaining change value
        change -= (nickels * 5); // subtract however many nickels user is given back (in cents)
        pennies = getChangeForUnit((int)change, 0.01); // get max number of pennies possible in remaining change value
        change -= (pennies * 1); // subtract however many pennies user is given back (in cents), should result in zero
        
        if (change >= 0.01) { // if change is greater than/equal to one cent, java math must have messed up somewhere
            System.out.println("Sorry, our cash register is encountering technical difficulties. Your change might not be accurate. Our apologies. Diagnostics:" + change); // inform user that java math is unreliable in current use case
        }
        
        String print; // create string (for concatenation) that will be printed later
        
        print = ""; // define string as a string
        
        if (origChange != 0) { // if there actually was change to give back (meaning payment didn't equal price)
            print += ("Here's your change: $" + origChange + " ("); // begin to print amount of change given, plus units
        
            print += addChangeToPrint(print, hundreds, "hundred", "hundreds");
            print += addChangeToPrint(print, fifties, "fifty", "fifties");
            print += addChangeToPrint(print, twenties, "twenty", "twenties");
            print += addChangeToPrint(print, tens, "ten", "tens");
            print += addChangeToPrint(print, fives, "five", "fives");
            print += addChangeToPrint(print, ones, "one", "ones");
            print += addChangeToPrint(print, quarters, "quarter", "quarters");
            print += addChangeToPrint(print, dimes, "dime", "dimes");
            print += addChangeToPrint(print, nickels, "nickel", "nickels");
            print += addChangeToPrint(print, pennies, "penny", "pennies");

            print += ("). "); // close parentheses opened at beginning of statement
        }
        
        print += ("Thank you for shopping at the Foo Bar. See you again soon!"); // add to print statement
        
        System.out.println(print); // print entire concatenated print statement
    }
    
    public static String addChangeToPrint(String print, int amount, String unitSingle, String unitMultiple) {
        
        String returnStatement = ""; // stores String returned
        
        if (amount == 1) { // if there was only one bill/coin
            returnStatement += checkIfCommaNeeded(print); // check if print statement needs a comma
            returnStatement += ("1 " + unitSingle); // add to print statement
        } else if (amount > 1) { // if there are multiple
            returnStatement += checkIfCommaNeeded(print); // check if print statement needs a comma
            returnStatement += (amount + " " + unitMultiple); // add number of bils/coins to print statement
        } else { // if there are zero of unit
            returnStatement += ""; // don't return anything
        }
        
        return returnStatement; // send back result of function
    }
    
    public static int getChangeForUnit(double change, double unit) { // takes inputs: change (amount of change left), unit (which bill/coin)
        
        int unitToCheck = (int)(unit * 100); // allows comparison of ints instead of doubles
        
        if ((unitToCheck == (10000)) || (unitToCheck == (5000)) || (unitToCheck == (2000)) || (unitToCheck == (1000)) || (unitToCheck == (500)) || (unitToCheck == (100)) || (unitToCheck == (25)) || (unitToCheck == (10)) || (unitToCheck == (5)) || (unitToCheck == (1))) { // only run if unit is a recognized bill amount
            return (int)((change - (change % unitToCheck)) / unitToCheck); // return correct number of bills/coins
        } else {
            System.out.println("getChangeForUnit unit error"); // print error
            System.exit(0); // end program (must be some code malfunction)
            return 0; // necessary to avoid "missing return statement" error
        }
        
    }
    
    public static double removeDollarSign(String text) { // remove any unnecessary text from inputs
        text = text.replaceAll("[^0-9.]", ""); // remove anything that's not a digit or a decimal
        double money; // create double to return
        try { // attempt to run code, otherwise throw error
            money = Double.parseDouble(text); // turn the string into a double and return the amount of money
        } catch (NumberFormatException e) { // if parseDouble throws error (meaning user gave text instead of a double)
            money = 0; // return no money inputted
            System.out.println("You had one job. Now you tried to give text when I asked for money. Seriously, if you're going to survive in life, you need to know the difference between text and money."); // berate user for not knowing how money is denominated
        } 
        return money; // return set double value
    }
    
    public static String checkIfCommaNeeded(String print) { // check if comma is needed when concatenating list of bills/coins in change
        if (print.toCharArray()[print.length() - 1] != '(') { //if the last character isn't an opening parenthesis, (meaning there's another term before this one) add a comma
            return ", "; // return a comma
        } else { // otherwise
            return ""; // return an empty string - makes no difference to concatenation in getChange()
        }
    }
    
    public static int round(double input) { // new round function
        int roundedInt; // end result
        
        int flooredInput = (int) Math.floor(input); // floor input value
        double decimalInput = input - flooredInput; // find difference between input and floored input value
        
        if (decimalInput > 0.5) { // if difference is greater than 0.5 (decimal was greater than 0.5)
            roundedInt = flooredInput + 1; // return value should be input value, rounded up
        } else {
            roundedInt = flooredInput; // return value should be input value, rounded down
        }
        
        return roundedInt; // return rounded result value
    }
    
    public static void checkout(Scanner input, double subtotal) { // checkout function, takes Scanner & subtotal as inputs
        double payment; // payment value
        double total; // total price value
        total = (double)(round(subtotal * 100 * 1.0925)) / 100; // add tax to subtotal value, round to two decimal places
        
        System.out.println("Your total today is $" + total + ". How much are you going to pay?"); // ask for payment
        payment = removeDollarSign(input.nextLine()); // receive payment, reduce to just a double w/o any text or other characters
        
        while ((payment < total) || ((round(payment * 10000) / 100) != (Math.floor(100 * payment)))) { // repeat while either of two below conditions are not met
            if (payment < total) { // repeat while payment doesn't cover price
                System.out.println("Sorry, that's not enough to cover $" + total + ". Please enter an amount of money that covers the cost."); // ask for enough money to cover total
                payment = removeDollarSign(input.nextLine()); // receive new payment, reduce to a double w/o any text or other characters
            } else if ((round(payment * 10000) / 100) != (Math.floor(100 * payment))) { // repeat while payment has more than 2 decimal places
                System.out.println("Sorry, we can't accept any more than two decimal places. Please enter an amount of money that conforms to typical monetary standards."); // tell user
                payment = removeDollarSign(input.nextLine()); // receive new payment, reduce to a double w/o any text or other characters
            }
        }
        getChange(total, payment); // print change, given price and payment
    }
}
