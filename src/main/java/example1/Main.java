package example1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("index.txt")){
            fileOutputStream.write("Labas2".getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
