/*
Angela Vargas CSD402 12.2 Programming Assignment
*/
public class Vargas_Mod12_2 {

    // yearlyService with no parameters
    public static double yearlyService() {
        double standardService = 150.00; // base cost
        return standardService;
    }

    // yearlyService with one parameter (oil change)
    public static double yearlyService(double oilChange) {
        double standardService = 150.00; // keep consistent
        return standardService + oilChange;
    }

    // yearlyService with two parameters (oil change + tire rotation)
    public static double yearlyService(double oilChange, double tireRotation) {
        double standardService = 150.00; // keep consistent
        return standardService + oilChange + tireRotation;
    }

    // yearlyService with three parameters (oil change + tire rotation – coupon)
    public static double yearlyService(double oilChange, double tireRotation, double coupon) {
        double standardService = 150.00; // keep consistent
        return (standardService + oilChange + tireRotation) - coupon;
    }

    // main method to test each overloaded method twice
    public static void main(String[] args) {
        System.out.println("CSD402 12.2 Programming Assignment");
        System.out.println("This program calculates the cost of a yearly auto service visit using method overloading.\n");

        // Test yearlyService() - no parameters
        System.out.println("Test 1 (no parameters): $" + yearlyService());
        System.out.println("Test 2 (no parameters): $" + yearlyService());

        // Test yearlyService(one parameter)
        System.out.println("\nTest 1 (with oil change): $" + yearlyService(100.00));
        System.out.println("Test 2 (with oil change): $" + yearlyService(95.00));

        // Test yearlyService(two parameters)
        System.out.println("\nTest 1 (with oil change + tire rotation): $" + yearlyService(100.00, 80.00));
        System.out.println("Test 2 (with oil change + tire rotation): $" + yearlyService(95.00, 75.00));

        // Test yearlyService(three parameters)
        System.out.println("\nTest 1 (with oil change + tire rotation - coupon): $" + yearlyService(100.00, 80.00, 20.00));
        System.out.println("Test 2 (with oil change + tire rotation - coupon): $" + yearlyService(95.00, 75.00, 15.00));
    }
}