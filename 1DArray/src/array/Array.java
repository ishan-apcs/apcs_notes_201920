package array;

public class Array {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        String[] array = "surprise".split("r");
        for (String text : array) {
            System.out.println(text);
        }
    }
}