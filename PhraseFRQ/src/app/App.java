package app;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }
    
    /* public static void replaceNthOccurrence(String str, int n, String repl) {
        int count = 0;

        for (int i = 0; i < currentPhrase.length() - str.length(); i++) {
            if (currentPhrase.substring(i, i + str.length()).equals(str)) {
                count++;
            }

            if (count == n) {
                currentPhrase = currentPhrase.substring(0, i) + repl + currentPhrase.substring(i+str.length());
                break;
            }
        }
    } */
    
    
    public void replaceNthOccurrence(String str, int n, String repl) {
        int i = findNthOccurrence(str, n);
        
        if (i >= 0) {
            currentPhrase = currentPhrase.substring(0, i) + repl + currentPhrase.substring(i+str.length());
        }
    }
    
    public int findLastOccurrence(String str) {
        int count = -1;

        for (int i = 0; i < currentPhrase.length() - str.length(); i++) {
            if (findNthOccurrence(str, i+1) == -1) {
                return i-1;
            }
        }
    }
}