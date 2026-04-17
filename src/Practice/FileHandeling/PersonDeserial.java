package Practice.FileHandeling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class PersonDeserial {
    public static void main(String[] args) {
        FileInputStream fis =null;
        ObjectInputStream ois =null;
        try
        {
            fis = new FileInputStream("/Users/dhruvitjalodhara/Programming/serial1.txt");
            ois = new ObjectInputStream(fis);
            Person p1 = (Person)ois.readObject();
            System.out.println("Age :"+p1.age);
            System.out.println("weight :"+p1.weight);
            System.out.println("Height :"+p1.height);
            System.out.println("Name :"+p1.name);
            System.out.println("sid :"+p1.sid);
            System.out.println("sno :"+p1.sno);
        } catch(IOException ex) {
            ex.printStackTrace();
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        } finally {
            try{
                if(ois != null)
                    ois.close();

                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
