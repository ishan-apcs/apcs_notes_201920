import java.util.ArrayList;

public class App {
    static String[] tokens = {"<q>", "yy", "</q>", "zz", "</q>"};
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(getDelimitersList(tokens));
        System.out.println(isBalanced(getDelimitersList(tokens)));
    }

    static String openDel = "<q>";
    static String closeDel = "</q>";

    public static ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> list = new ArrayList<String>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                list.add(token);
            }
        }
        return list;
    }

    public static boolean isBalanced (ArrayList<String> delimiters) {
        int open = 0;
        int close = 0;
        
        for (int i = 0; i < delimiters.size(); i++) {
            if (delimiters.get(i).equals(openDel)) {
                open++;
            } else if (delimiters.get(i).equals(closeDel)) {
                close++;
            }

            if (close > open) {
                return false;
            }
        }
        return open == close;
    }
}
