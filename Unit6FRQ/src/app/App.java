package app;

public class App {
    static int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
    double[] wages;
    public static void main(String[] args) throws Exception {
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        for (String word : words) {
            if (word.endsWith("ing")) {
                System.out.println(word);
            }
        }
        
        for (String word : words) {
            if (word.substring(word.length() - 3).equals("ing")) {
                System.out.println(word);
            }
        }

        System.out.println(computeBonusThreshold());
    }

    public static double computeBonusThreshold() {
        int min = itemsSold[0];
        int max = itemsSold[0];
        int sum = 0;

        for (int i : itemsSold) {
            sum += i;
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }

        sum -= (max + min);
        return ((double) sum) / (itemsSold.length - 2);
    }

    public static double computeBonusThreshold2() {
        double bonus = 0;

        for (int i = 0; i < itemsSold.length; i++) {
            bonus += itemsSold[i];
        }

        int temp = 0;
        for (int i = 0; i < itemsSold.length - 1; i++) {
            for (int j = i+1; j < itemsSold.length; j++) {
                if (itemsSold[i] > itemsSold[j]) {
                    temp = itemsSold[i];
                    itemsSold[i] = itemsSold[j];
                    itemsSold[j] = temp;
                }
            }
        }

        bonus -= itemsSold[0];
        int size = itemsSold.length;
        bonus -= itemsSold[size-1];
        bonus /= (double) size-2;
        return bonus;
    }

    public void computeWages(double fixedWage, double perItemWage) {
        wages = new double[itemsSold.length];
        double bonusThreshold = computeBonusThreshold();

        for (int i = 0; i < itemsSold.length; i++) {
            wages[i] = fixedWage + itemsSold[i] * perItemWage;
            
            if (itemsSold[i] > bonusThreshold) {
                wages[i] *= 1.1;
            }
        }
    }
}