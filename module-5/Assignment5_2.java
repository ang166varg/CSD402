/*
 * Author: Angela Vargas
 * Course: CSD402
 * Assignment: 5.2 - Locate Largest and Smallest in a 2D Array
 * Note: This program contains methods to locate the largest and smallest 
 *       element positions in both int[][] and double[][] arrays.
 */

public class Assignment5_2 {

    // Method for locating the largest element in a double 2D array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2]; // row, column
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method for locating the largest element in an int 2D array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method for locating the smallest element in a double 2D array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method for locating the smallest element in an int 2D array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Example main method to test the functions
    public static void main(String[] args) {
        int[][] intArray = {
            {4, 7, 2},
            {9, 5, 1},
            {3, 8, 6}
        };

        double[][] doubleArray = {
            {2.5, 7.1, 3.3},
            {4.9, 1.2, 8.6},
            {5.0, 6.7, 0.4}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int location: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest int location: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
        System.out.println("Largest double location: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest double location: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
}
