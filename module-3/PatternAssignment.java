/*
 * Angela Vargas
 * CSD402
 * 3.3 Assignment
 */

public class PatternAssignment {
    public static void main(String[] args) {
        int rows = 7;  // Number of rows in the pattern

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for formatting
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("   ");
            }

            // Left side numbers (increasing powers of 2)
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }

            // Right side numbers (decreasing powers of 2)
            num /= 2;
            for (int j = i - 1; j >= 0; j--) {
                num /= 2;
                System.out.print(num + " ");
            }

            // Print the @ symbol aligned at the end
            System.out.println("   @");
        }
    }
}