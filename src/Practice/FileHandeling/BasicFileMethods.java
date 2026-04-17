package Practice.FileHandeling;

import java.io.File;
import java.io.IOException;

public class BasicFileMethods {
    public static void main(String[] args) {

        try {
//            File f = new File("/Users/dhruvitjalodhara/programming/abc.txt");
//            System.out.println(f.exists());
//            f.createNewFile();
//            System.out.println(f.canRead());
//            System.out.println(f.isFile());
//            System.out.println(f.canExecute());
//            System.out.println(f.canWrite());
//            System.out.println(f.exists());
//            System.out.println(f.getAbsolutePath());
//            System.out.println(f.getCanonicalPath());
//            System.out.println(f.getName());
//            System.out.println(f.getParent());
//            System.out.println(f.getPath());
//            System.out.println(f.isDirectory());
//            System.out.println(f.isAbsolute());
//            System.out.println(f.isHidden());
//            System.out.println(Arrays.toString(f.list()));
//            System.out.println(f.mkdir());
//            f.delete();

            // to create single folder
            File f1 = new File("/Users/dhruvitjalodhara/programming/abc");
            f1.mkdir();
            File f0 = new File(f1, "abc.txt");
            f0.createNewFile();

            // to create nested folder
//            File f2 = new File("/Users/dhruvitjalodhara/programming/A/B/C");
//            f2.mkdirs();

//            File f3 = new File(f2, "abc.txt");
//            f3.createNewFile();
//            String ab_path = f3.getAbsolutePath();
//            System.out.println("absolute path : " + ab_path);
//            System.out.println("Name : " + f3.getName());

            File f4 = new File("/Users/dhruvitjalodhara/programming");
            String[] all = f4.list();

            for(String x : all) {
                System.out.println(x);
            }

            File[] allFile = f4.listFiles();
            int dcount = 0 , fcount = 0;
            for(File x : allFile){
                if(x.isDirectory())
                    dcount++;
                if(x.isFile())
                    fcount++;
            }
            System.out.println("fcount : "+ fcount);
            System.out.println("dcount : "+ dcount);

        } catch (IOException e) {
            e.getMessage();
        }


    }
}
