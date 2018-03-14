package example4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("index2.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             ) {

            int i;
            while ((i=bis.read())!=-1){
                System.out.print((char)i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
