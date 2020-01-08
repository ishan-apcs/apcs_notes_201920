package convertbases;

public class Dec2Bin {
    public static void main(String[] args) {
        int dec = 25;
        String bin = "";

        while (dec > 0) {
            bin = dec % 2 + bin;
            dec /= 2;
        }

        System.out.println(bin);
    }
}