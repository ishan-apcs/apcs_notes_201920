package convertbases;

public class Bin2Dec {
    public static void main(String[] args) {
        String bin = "1010";
        int dec = 0;

        for (int i = bin.length() - 1; i >= 0; i--) {
            String temp = bin.substring(i, i+1);
            int tempInt;
            tempInt = Integer.parseInt(temp);
            
            dec += tempInt * (int)Math.pow(2, bin.length() - 1 - i);
        }

        System.out.println(dec);
    }
}