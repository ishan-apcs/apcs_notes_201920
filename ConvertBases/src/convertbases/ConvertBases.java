/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertbases;

/**
 *
 * @author ishanmadan
 */
public class ConvertBases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(convertBases("3F", 16, 8));
    }

    public static String convertBases(String start, int startBase, int endBase) {
        if (startBase == 10 && endBase == 10) {
            return start;
        } else if (startBase == 10) {
            return convertToBase(Integer.parseInt(start), endBase);
        } else if (endBase == 10) {
            return "" + convertToDec(start, startBase);
        } else {
            return convertToBase(convertToDec(start, startBase), endBase);
        }
    }

    public static int convertToDec(String start, int base) {
        int dec = 0;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = start.length() - 1; i >= 0; i--) {
            String temp = start.substring(i, i+1);
            int tempInt;
            
            try {
                tempInt = Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                tempInt = 10 + alphabet.indexOf(temp);
            }
            
            dec += tempInt * (int)Math.pow(base, start.length() - 1 - i);
        }

        return dec;
    }

    public static String convertToBase(int dec, int base) {
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

        return result;
    }
}
