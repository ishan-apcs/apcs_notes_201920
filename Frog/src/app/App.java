package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }

    public boolean simulate() {
        int distance = 0;
        for (int i = 0; i < maxHops; i++) {
            distance += hopDistance();
            if (distance >= goalDistance) {
                return true;
            } else if (distance < 0) {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        int success = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                success++;
            }
        }
        return ((double)success) / num;
    }
}