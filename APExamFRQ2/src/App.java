public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(letterAndPattern("Z", "QUICK"));
    }

    public static String letterAndPattern(String letter, String pattern) {
        if (pattern.indexOf(letter) > -1) {
            return letter;
        } else {
            String[] array = pattern.split("");
            String reverse = "";
            for (int i = array.length - 1; i >= 0; i--) {
                reverse += array[i];
            }
            return reverse;
        }
    }

    /**
     * The StringPatterns class needs a public int called limit. This variable will
     * hold the maximum length of an allowed string. It is public to allow other
     * classes to modify it if necessary. When declared, limit must contain the
     * initial value of the maximum string length. At the beginning of the
     * letterAndPattern method, an if statement must compare the limit int to
     * pattern.length(). If pattern.length() is greater than limit, the if statement
     * must return an empty string ("").
     */
}
