package LAB_07;

class Teacher1 {
    double phy;
    double maths;
    double che;
    double eng;
    double result;

    void setMarks(double phy, double maths, double che, double eng) {
        this.phy = phy;
        this.maths = maths;
        this.che = che;
        this.eng = eng;
    }

    void setResult() {
        result = (phy + che + eng + maths) / 4;
    }
}

class Student1 extends Teacher1 {
    String studentID;

    Student1(String studentID) {
        this.studentID = studentID;
    }

    void getMarks() {
        System.out.println("Student Id: " + studentID);
        System.out.println("Phy: " + phy);
        System.out.println("Che: " + che);
        System.out.println("Maths: " + maths);
        System.out.println("Eng: " + eng);
    }

    void getResult() {
        System.out.println("Student Id: " + studentID);
        System.out.println("Result: " + result);
    }
}

public class Q04 {
    public static void main(String[] args) {

        Student1 s1 = new Student1("I25AI003");

        s1.setMarks(89, 95, 85, 70);
        s1.setResult();

        s1.getMarks();
        s1.getResult();
    }
}
