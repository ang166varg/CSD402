// Angela Vargas CSD402 9.2 Programming Assignment
// Program 2: File create, write, append, read

import java.io.*;
import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            // If file doesn't exist, create it
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending data...");
            }

            // Append 10 random numbers
            FileWriter writer = new FileWriter(file, true);
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // random number 0–99
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("10 random numbers written/appended to file.");

            // Reopen and read the file
            Scanner reader = new Scanner(file);
            System.out.println("\nNumbers in data.file:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}