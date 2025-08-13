/*
Angela Vargas
CSD402
1.3 Assignment
*/
import java.util.Scanner;

public class WaterHeatingCode{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy in Joules
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.printf("The energy needed is %.2f Joules.%n", Q);

        input.close();
    }
}