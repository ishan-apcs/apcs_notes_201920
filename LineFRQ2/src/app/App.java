package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5, -2);

        System.out.println("placeholder");
    }
}

class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int inA, int inB, int inC) {
        a = inA;
        b = inB;
        c = inC;
    }

    public double getSlope() {
        return -1.0 * a / b;
    }

    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
}