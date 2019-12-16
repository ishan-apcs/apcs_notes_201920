package hw.pkg17;

public class Date {
    public int x = 5;
    public int month;
    public int day;
    public int year;

    public void addYears(int n) { //add n years to date
        year += n;
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date() {

    }
}