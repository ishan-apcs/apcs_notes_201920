import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}

class StepTracker {
    private int minSteps;
    private ArrayList<Integer> days;

    public StepTracker(int activeMin) {
        minSteps = activeMin;
        days = new ArrayList<Integer>();
    }

    public void addDailySteps(int steps) {
        days.add(steps);
    }

    public int activeDays() {
        int count = 0;
        for (int steps : days) {
            if (steps >= minSteps) {
                count++;
            }
        }
        return count;
    }

    public double averageSteps() {
        if (days.size() > 0) {
            double sum = 0;
            for (int steps : days) {
                sum += steps;
            }

            return sum / days.size();
        } else {
            return 0;
        }
    }
}