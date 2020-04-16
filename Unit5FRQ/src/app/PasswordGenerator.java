package app;

public class PasswordGenerator {
    private String prefix;
    private int length;
    private static int count = 0;

    public PasswordGenerator(int l, String p) {
        prefix = p;
        length = l;
    }
    
    public PasswordGenerator(int l) {
        prefix = "A";
        length = l;
    }

    public String pwGen() {
        String numbers = "";
        
        for (int i = 0; i < length; i++) {
            numbers = numbers + (int)(Math.random() * 10);
        }

        count++;
        return prefix + "." + numbers;
    }

    public int pwCount() {
        return count;
    }
}