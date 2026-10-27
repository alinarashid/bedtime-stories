package com.pluralsight;
import java.io.*;
import java.util.Scanner;

/**
 * Bedtime Stories
 * Asks the user for a story name, reads that story's text file
 * line by line with BufferedReader, and prints it with line numbers.
 */

public class BedtimeStories {
    public static void main(String[] args) {

        // Scanner to read the user's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the story: ");
        String fileName = scanner.nextLine();

        // try: opening/reading a file can fail (e.g. file not found)
        try {
            // Open the story file (adds .txt so the user only types the name)
            BufferedReader reader = new BufferedReader(new FileReader(fileName+".txt"));
            String line;

            // Counts lines so each one can be numbered
            int totalLines = 0;

            // Read one line at a time until readLine() returns null (end of file)
            while ((line = reader.readLine()) != null) {

                // Add 1 first so numbering starts at 1, not 0
                totalLines++;
                System.out.println( totalLines+". "+line);

            }

            // Show how many lines the story had
            System.out.println("The story had " + totalLines + " lines.");

            // Close file
            reader.close();

        }catch (IOException e) {

            // Runs if the file can not be found or read
            System.out.println("Sorry, unable to find the file: " + fileName);


        }
        // close the Scanner at the end of the program
        scanner.close();

    }
}
