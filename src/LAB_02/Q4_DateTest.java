package LAB_02;

public class Q4_DateTest {
    public static void main(String[] args) {
        Date d = new Date(9, 12, 2025);
        System.out.print("Date : ");
        d.displayDate();
    }
}

class Date {

    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Set methods
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Get methods
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Display method
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

