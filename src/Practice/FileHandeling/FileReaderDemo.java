package Practice.FileHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo{
    public static void main(String[] args) {
        File f1 = null;
        FileReader fr = null;

        try{
            System.out.println("start : ");
            f1 = new File("/Users/dhruvitjalodhara/Programming/xyz.txt");
            fr = new FileReader(f1);
            int ch;

            while((ch = fr.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
