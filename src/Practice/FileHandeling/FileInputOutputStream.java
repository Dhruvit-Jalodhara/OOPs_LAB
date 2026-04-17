package Practice.FileHandeling;

import java.io.*;

// Image Read and Write using FileInputStream and OutputStream Class
public class FileInputOutputStream {
    public static void main(String[] args) {
        File f1 = null;
        FileInputStream fis = null;     // reading binary data
        FileOutputStream fos = null;    // write binary data

        // method 1 :
//        try{
//            f1 = new File("/Users/dhruvitjalodhara/Pictures/ScreenShots/Screenshot 2026-03-14 at 6.00.35 PM.png");
//
//            fis = new FileInputStream(f1);
//
//            long len = f1.length();
//            byte[] all = new byte[(int) len];
//
//            fis.read(all);
//
//            fos =new FileOutputStream("/Users/dhruvitjalodhara/Programming/abc.png");
//            fos.write(all);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(fis != null)
//                    fis.close();
//
//                if(fos != null)
//                    fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        // method 2 :
        try{
            fis = new FileInputStream("/Users/dhruvitjalodhara/Pictures/ScreenShots/Screenshot 2026-03-14 at 6.00.35 PM.png");
            fos = new FileOutputStream("/Users/dhruvitjalodhara/Programming/abc.png");

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                    fis.close();

                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
