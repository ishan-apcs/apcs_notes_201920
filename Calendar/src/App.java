public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }
        return count;
    }

    public static int dayOfWeek(int month, int day, int year) {
        return (firstDayOfYear(year) + (dayOfYear(month, day, year) - 1) % 7) % 7;
    }
}