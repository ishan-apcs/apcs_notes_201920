package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }
}

class WordPair {
    private String first;
    private String second;
    
    public WordPair(String first, String second) {
        this.first = first;
        this.second = second;
    }
    
    public String getFirst() {
        return first;
    }
    
    public String getSecond() {
        return second;
    }
}

class WordPairList {
    private ArrayList<WordPair> allPairs;
    
    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
    
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i+1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }
    
    public int numMatches() {
        int count = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
                count++;
            }
        }
        return count;
    }   
}