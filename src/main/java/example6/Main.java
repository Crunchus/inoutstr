package example6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader fire = new FileReader("index3.txt")) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
