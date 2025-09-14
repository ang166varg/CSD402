// Angela Vargas CSD402 8.2 Programming Assignment

import java.util.ArrayList;
import java.util.Scanner;

public class AngelaArrayListTest {

    // Method to find the largest Integer in an ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0; // return 0 if list is empty
        }

        Integer largest = list.get(0);
        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        
        System.out.println("This program collects integers into an ArrayList and finds the largest value.");
        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            int value = input.nextInt();
            numbers.add(value);
            if (value == 0) {
                break;
            }
        }

        // Call max() and display the largest value
        Integer largestValue = max(numbers);
        System.out.println("\n--- Results ---");
        System.out.println("Numbers entered: " + numbers);
        System.out.println("The largest value in the ArrayList is: " + largestValue);

        input.close();
    }
}