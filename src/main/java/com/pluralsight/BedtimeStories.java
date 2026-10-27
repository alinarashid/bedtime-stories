package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the story: ");
        String fileName = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName+".txt"));
            String line;

            int totalLines = 0;

            while ((line = reader.readLine()) != null) {
                totalLines++;
                System.out.println( totalLines+". "+line);

            }

            System.out.println("The story had " + totalLines + " lines.");
            reader.close();
        }catch (IOException e) {
            System.out.println("Sorry, unable to find the file: " + fileName);


        }
        scanner.close();

    }
}
