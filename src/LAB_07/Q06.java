package LAB_07;


class Course{
    int memberID;
    String description;
    int duration;
    double fees;
    Course(int memberID,String description,int duration,double fees){
        this.memberID=memberID;
        this.description=description;
        this.fees=fees;
        this.duration=duration;
    }
    void getData(){
        System.out.println("MemberId :"+memberID);
        System.out.println("Description :"+description);
        System.out.println("Fees :"+fees);
        System.out.println("Duration :"+duration);
    }
}

public class Q06 {
    public static void main(String[] args) {
        Course[] courseArr= new Course[5];
        courseArr[0]= new Course(12, "GUJCET", 8, 100);
        courseArr[1]= new Course(34, "NEET", 9, 1000);
        courseArr[2]= new Course(56, "UPSC", 10, 500);
        courseArr[3]= new Course(78, "BOARD", 6, 60);
        courseArr[4]= new Course(90, "JEE", 7, 4000);

        System.out.println("Print the details of Five objects of the course");
        for(int i=0;i<5;i++){
            courseArr[i].getData();
        }
    }
}

