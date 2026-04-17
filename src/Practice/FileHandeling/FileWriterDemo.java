package Practice.FileHandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        File f1 = null;
        FileWriter fw = null;
        try{
            f1 = new File("/Users/dhruvitjalodhara/Programming/xyz.txt");
            fw = new FileWriter(f1);

            fw.write("this is f.write() method us to write in file ");
            System.out.println("length of File : " + f1.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fw != null){
                    fw.flush(); // after this step file is written
                    fw.close();
                    System.out.println("length of File : " + f1.length());
                }
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
