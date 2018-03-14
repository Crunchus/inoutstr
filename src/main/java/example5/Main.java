package example5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter fiwr = new BufferedWriter(new FileWriter("index4.txt"))) {
            fiwr.write("Petsonas, 360");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
