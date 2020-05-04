package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChooser.getNext() + " ");
        }
        System.out.println();

        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++) {
            System.out.print(letterChooser.getNext());
        }
        System.out.println();
    }
}

class RandomStringChooser {
    private String[] words;
    private ArrayList<String> usedWords;

    public RandomStringChooser(String[] wordArray) {
        words = wordArray;
        usedWords = new ArrayList<String>();
    }

    public String getNext() {
        int index = (int) (Math.random() * words.length);
        
        if (usedWords.size() == words.length) {
            return "NONE";
        }

        while (usedWords.indexOf(words[index]) != -1) {
            index = (int) (Math.random() * words.length);
        }

        usedWords.add(words[index]);
        return words[index];
    }
}

class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str) {
        return str.split("");
    }
}