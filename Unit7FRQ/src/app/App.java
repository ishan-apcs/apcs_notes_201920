package app;

import java.util.ArrayList;

public class App {

    ArrayList<String> possibleNames;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }

    public UserName(String firstName, String lastName) {
        possibleNames = new ArrayList<String>();
        
        for (int i = 1; i <= firstName.length(); i++) {
            possibleNames.add(lastName + firstName.substring(0, i));
            i--;
        }
    }

    public void setAvailableUserNames(String[] usedNames) {
        for (int i = 0; i < possibleNames.size(); i++) {
            if (isUsed(possibleNames.get(i), usedNames)) {
                possibleNames.remove(i);
            }
        }
    }
}