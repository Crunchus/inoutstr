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

            String fileTextLine;
            int wordCount = 0;

            while((fileTextLine = mhaHart.readLine()) != null){
                String[] splitFileTextLine = fileTextLine.split(" ");
                wordCount += splitFileTextLine.length;
            }

            System.out.println("The word count is " + wordCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
