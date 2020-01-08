package convertbases;

public class ConvertToBase {
    public static void main(String[] args) {
        int dec = 254;
        int base = 25;
        
        String result = "";
        String temp = "";
        int tempInt = 0;

        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

        while (dec > 0) {
            if (base > 25 || base < 2) {
                System.out.println("Sorry, your base is invalid. Please use a base below from 2 to 25 (not inclusive).");
                break;
            }

            tempInt = dec % base;

            if (tempInt > 9) {
                temp = alphabet[tempInt - 10];
            } else {
                temp = "" + tempInt;
            }

            result = temp + result;
            dec /= base;
        }

        System.out.println(result);
    }
    
}
