package app;

public class App {
    public static void main(String[] args) throws Exception {
        // How to create a string
        String string1 = "hello there";
        String string2 = new String("general kenobi");

        // How to find something in a string
        string1.indexOf("t");
        string2.indexOf("e", 5);

        // How to get part of a string
        string1.substring(4);
        string2.substring(6, 8);

        // How to compare parts or all of strings
        string1.compareTo(string2);
        string1.substring(4).compareTo(string2.substring(6, 8));

        // How to add onto strings
        string1 += "\n";
        string1 += string2;

        // How do you print special characters
        String string3 = "\b \t \n \f \r \" \' \\";

        // How to delete the contents of a string
        string3 = null;
        string3 = "";
    }
}