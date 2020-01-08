package classes3;

public class APLine {
    int a;
    int b;
    int c;

    public APLine(int inA, int inB, int inC) {
        a = inA;
        b = inB;
        c = inC;
    }

    public double getSlope() {
        return -1.0 * a / b;
    }

    public boolean isOnLine(int x, int y) {
        return (a * x + b * y + c) == 0;
    }
}