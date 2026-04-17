package Practice.FileHandeling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// serializable is used to store object of any class in file (in encrypted form)
public class PersonSerial {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=24;
        p1.weight=56.7f;
        p1.height=5.11;
        p1.name="dhruvit";
        p1.sid=45555;
        p1.sno=411;

        FileOutputStream fos =null;
        ObjectOutputStream oos =null;

        try{
            fos = new FileOutputStream("/Users/dhruvitjalodhara/Programming/serial1.txt");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(p1);

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                if(oos != null)
                    oos.close();

                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
