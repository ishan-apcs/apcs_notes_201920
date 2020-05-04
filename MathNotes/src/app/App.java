package app;

public class App {
    public static void main(String[] args) throws Exception {
        // random double from 0 to 1 (no parameter)
        double num1 = Math.random();
        
        // random int in range (shift, shift+range]
        int num2 = (int) (Math.random() * range + shift);

        // absolute value (double)
        double num3 = Math.abs(5.0);
        double num4 = Math.abs(7);

        // exponent
        // no such thing as Math.exp()
        double num5 = Math.pow(5.0, 2.0);

        // square root
        double num6 = Math.sqrt(16.0);
    }
}