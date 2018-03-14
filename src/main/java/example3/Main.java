package example3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try (
                FileOutputStream fos = new FileOutputStream("index2.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
             ) {
            bos.write("lape snape".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
