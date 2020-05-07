package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        System.out.println("" + sc1.isValid("happy") + sc1.isValid("happy$") + sc1.isValid("Code") + sc1.isValid("happyCode"));

        StringChecker sc2 = new CodeWordChecker("pass");
        System.out.println("" + sc2.isValid("MyPass") + sc2.isValid("Mypassport") + sc2.isValid("happy") + sc2.isValid("1,000,000,000,000,000"));
    }
}

interface StringChecker {
    boolean isValid(String str);
}

class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String exclude;

    public CodeWordChecker(int min, int max, String exclude) {
        this.min = min;
        this.max = max;
        this.exclude = exclude;
    }

    public CodeWordChecker(String exclude) {
        min = 6;
        max = 20;
        this.exclude = exclude;
    }

    public boolean isValid(String str) {
        return str.length() >= min && str.length() <= max && str.indexOf(exclude) == -1;
        // return str.length() >= min && str.length() <= max && !str.contains(exclude);
    }
}