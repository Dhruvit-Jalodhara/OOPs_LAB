package LAB_08;

import java.io.*;

public class Q05 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sdj.txt"));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            br.close();

            String updated = content.toString().replaceAll("\\bhis\\b", "her");

            BufferedWriter bw = new BufferedWriter(new FileWriter("sdj.txt"));
            bw.write(updated);
            bw.close();

            System.out.println("Replacement done successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
