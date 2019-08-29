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
            change = (double)(round(change * 100)) / 100;// make change a decimal with 2 places
        }
        
        origChange = change;
        
        change *= 100; //allows getChangeForUnit function to use ints instead of doubles, since doubles are inherently bad in math
        change = round(change);
        
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
        double money;
        try {
            money = Double.parseDouble(text); // turn the string into a double and return the amount of money
        } catch (NumberFormatException e) {
            money = 0;
            System.out.println("You had one job. Now you tried to give text when I asked for money. Seriously, if you're going to survive in life, you need to know the difference between text and money.");
        } 
        return money;
    }
    
    public static String checkIfCommaNeeded(String print) { // check if comma is needed when concatenating list of bills/coins in change
        if (print.toCharArray()[print.length() - 1] != '(') { //if the last character isn't an opening parenthesis, (meaning there's another term before this one) add a comma
            return ", ";
        } else {
            return "";
        }
    }
    
    public static int round(double input) {
        int roundedInt;
        
        int flooredInput = (int) Math.floor(input);
        double decimalInput = input - flooredInput;
        
        if (decimalInput > 0.5) {
            roundedInt = flooredInput + 1;
        } else {
            roundedInt = flooredInput;
        }
        
        return roundedInt;
    }
    
    public static void checkout(Scanner input, double price) {
        double amountGiven;
        double total;
        total = (double)(MakingChangeChooser.round(price * 100 * 1.0925)) / 100;
        
        System.out.println("Your total today is $" + total + ". How much are you going to pay?"); // check for payment
        amountGiven = MakingChangeChooser.removeDollarSign(input.nextLine());
        
        while (amountGiven < price) { // make sure payment covers price
            System.out.println("Sorry, that's not enough to cover $" + total + ". Please enter an amount of money that covers the cost.");
            amountGiven = MakingChangeChooser.removeDollarSign(input.nextLine());
        
            while (amountGiven * 100 != (Math.floor(100 * amountGiven))) {
                System.out.println("Sorry, we can't accept any more than two decimal places");
                amountGiven = MakingChangeChooser.removeDollarSign(input.nextLine());
            }
        }
        
        MakingChangeChooser.getChange(price, amountGiven); // print change, given price and payment
    }
}
