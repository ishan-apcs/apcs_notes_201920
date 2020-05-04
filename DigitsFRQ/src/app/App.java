package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        
        Digits d1 = new Digits(15704);
        Digits d2 = new Digits(0);
    }
}

class Digits {
    private ArrayList<Integer> digitList;
    
    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            digitList.add(0, num%10);
            num /= 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) <= digitList.get(i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}