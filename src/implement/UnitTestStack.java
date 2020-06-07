package implement;

import java.io.*;

public class UnitTestStack {
    public static void main(String[] args) throws Exception{
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            File file = new File("input.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
