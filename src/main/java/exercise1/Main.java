package exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("input file path");
//        String path = input.nextLine();
        try (BufferedReader mhaHart = new BufferedReader(new FileReader("cookies.txt"))) {
            String fileText = mhaHart.readLine();
            String[] splitFileText = fileText.split(" ");
            int wordCount = splitFileText.length;
            System.out.println("The word count" + wordCount);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
