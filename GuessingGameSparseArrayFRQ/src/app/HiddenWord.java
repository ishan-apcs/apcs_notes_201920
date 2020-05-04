package app;

public class HiddenWord {
    private String word;

    public HiddenWord(String inWord) {
        word = inWord;
    }

    public String getHint(String guess) {
        String[] array = guess.split("");

        for (int i = 0; i < array.length; i++) {
            if (word.indexOf(array[i]) == -1) {
                array[i] = "*";
            } else if (word.indexOf(array[i]) != i) {
                array[i] = "+";
            }
        }

        String newWord = "";

        for (int i = 0; i < array.length; i++) {
            newWord += array[i];
        }

        return newWord;
    }
}