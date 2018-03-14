package example5;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fiwr = new FileWriter("index3.txt")) {
            fiwr.write("O hai Mark");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
