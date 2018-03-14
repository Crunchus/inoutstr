package example6;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader fire = new BufferedReader(new FileReader("index4.txt"))) {

            String line;
            while((line = fire.readLine()) != null) {

                String[] split = line.split(",");
                Person person = new Person();
                person.setName(split[0]);
                person.setHeight(split[1]);

                System.out.println(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
