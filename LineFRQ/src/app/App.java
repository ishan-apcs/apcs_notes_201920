package app;

public class App {
    static int[] markers = { 100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100 };

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        System.out.println(isDifficult());
        System.out.println(isLevelTrailSegment(7, 10));
        System.out.println(isLevelTrailSegment(2, 12));
    }

    public static boolean isLevelTrailSegment(int start, int end) {
        int min = start;
        int max = start;
        for (int i = start; i <= end; i++) {
            if (markers[i] < markers[min]) {
                min = i;
            }
            if (markers[i] > markers[max]) {
                max = i;
            }
        }
        if (Math.abs(markers[max] - markers[min]) <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDifficult() {
        int counter = 0;
        for (int i = 0; i < markers.length - 1; i++) {
            if (Math.abs(markers[i] - markers[i + 1]) >= 30) {
                counter++;
            }
        }
        if (counter > 2) {
            return true;
        } else {
            return false;
        }
    }
}