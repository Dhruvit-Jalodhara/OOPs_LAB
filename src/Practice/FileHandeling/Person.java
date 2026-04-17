package Practice.FileHandeling;

import java.io.Serializable;

public class Person implements Serializable {
    int age;
    float weight;
    double height;
    String name;
    static int sid;
    transient int sno;
}
