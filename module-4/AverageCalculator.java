/*
Angela Vargas CSD402 4.2 Assignment
*/

public class AverageCalculator {

    // Method to calculate average of short array
    public static short average(short[] array) {
        int sum = 0; // use int to prevent overflow
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    // Method to calculate average of int array
    public static int average(int[] array) {
        long sum = 0; // use long to prevent overflow
        for (int value : array) {
            sum += value;
        }
        return (int)(sum / array.length);
    }

    // Method to calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Main method to test the overloaded average methods
    public static void main(String[] args) {
        
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 15, 25, 35};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display results for short array
        System.out.print("Short Array: ");
        for (short s : shortArray) {
            System.out.print(s + " ");
        }
        System.out.println("\nAverage (short): " + average(shortArray) + "\n");

        // Display results for int array
        System.out.print("Int Array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nAverage (int): " + average(intArray) + "\n");

        // Display results for long array
        System.out.print("Long Array: ");
        for (long l : longArray) {
            System.out.print(l + " ");
        }
        System.out.println("\nAverage (long): " + average(longArray) + "\n");

        // Display results for double array
        System.out.print("Double Array: ");
        for (double d : doubleArray) {
            System.out.print(d + " ");
        }
        System.out.println("\nAverage (double): " + average(doubleArray) + "\n");
    }
}