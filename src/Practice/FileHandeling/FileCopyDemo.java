package Practice.FileHandeling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) {
        File f1 = null;
        File f2 = null;
        FileReader fr = null;
        FileWriter fw1 = null;
        FileWriter fw2 = null;

        // creating file1 and writing in it
        try{
            f1 = new File("/Users/dhruvitjalodhara/Programming/file1.txt");
            fw1 = new FileWriter(f1);
            fw1.write("this is file1 we are gonna copy it to file2");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fw1 != null){
                    fw1.flush();
                    fw1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // copy file1 inton file2
        try{
            f2 = new File("/Users/dhruvitjalodhara/Programming/file2.txt");
            fw2 = new FileWriter(f2);
            fr = new FileReader(f1);

            char[] buffer = new char[1024];
            int bufferSize = 0;
            while((bufferSize = fr.read(buffer)) != -1){
                fw2.write(buffer , 0 , bufferSize);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fw2 != null){
                    fw2.flush();
                    fw2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
