package LAB_02;

public class Q4_DateTest {
    public static void main(String[] args) {
        Date d = new Date(9, 12, 2025);
        d.displayDate();
    }
}

class Date {
    private int month, day, year;

    public Date(int d, int m, int y) {
        month = m;
        day = d;
        year = y;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

