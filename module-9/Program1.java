// Angela Vargas CSD402 9.2 Programming Assignment
// Program 1: ArrayList, for-each, try/catch, autoboxing/unboxing

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Create an ArrayList with 10+ Strings
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");
        items.add("Fig");
        items.add("Grape");
        items.add("Honeydew");
        items.add("Kiwi");
        items.add("Lemon");

        System.out.println("List of fruits:");
        for (String fruit : items) {
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the element you want to see again: ");

        // Autoboxing: primitive int → Integer object
        Integer index = scanner.nextInt();

        try {
            // Auto-unboxing: Integer → int automatically
            String chosen = items.get(index);
            System.out.println("You selected: " + chosen);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}