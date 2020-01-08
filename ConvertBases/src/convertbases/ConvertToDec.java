package convertbases;

public class ConvertToDec {
    public static void main(String[] args) {
        String start = "6F";
        int base = 16;
        
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

        System.out.println(dec);
    }
}