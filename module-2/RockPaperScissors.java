/*
Angela Vargas, CSD402, 2.2 Assignment
*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Computer randomly picks 1-3
        int computerChoice = random.nextInt(3) + 1;

        // Ask user for input
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: (1 = Rock, 2 = Paper, 3 = Scissors)");
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input! Please enter 1, 2, or 3 only.");
        } else {
            // Display choices
            System.out.println("You chose: " + choiceToString(userChoice));
            System.out.println("Computer chose: " + choiceToString(computerChoice));

            // Determine winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }

    // Helper method to convert number to text
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
}