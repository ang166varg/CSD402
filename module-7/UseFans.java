/*
    Angela Vargas
    CSD402
    7.2 Programming Assignment
*/

import java.util.ArrayList;
import java.util.List;

// Fan class
class Fan {
    private String brand;
    private int speed;
    private boolean isOn;

    // Constructor
    public Fan(String brand, int speed, boolean isOn) {
        this.brand = brand;
        this.speed = speed;
        this.isOn = isOn;
    }

    // Getters and setters using 'this' reference
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}

// UseFans class
public class UseFans {

    // Method to display one fan without toString
    public static void displayFan(Fan fan) {
        System.out.println("Fan brand: " + fan.getBrand() +
                           ", Speed: " + fan.getSpeed() +
                           ", Status: " + (fan.isOn() ? "On" : "Off"));
    }

    // Method to display a collection of fans without toString
    public static void displayFans(List<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);  // Reuse single fan method
        }
    }

    // Main method
    public static void main(String[] args) {
        // Explanation message
        System.out.println("This program demonstrates the use of classes, objects, collections, " +
                           "and the 'this' reference in Java. It creates several Fan instances, " +
                           "stores them in a collection, and displays their details without using " +
                           "the toString() method.\n");

        // Create Fan objects
        Fan fan1 = new Fan("Dyson", 3, true);
        Fan fan2 = new Fan("Honeywell", 2, false);
        Fan fan3 = new Fan("Lasko", 1, true);

        // Add to collection
        List<Fan> fans = new ArrayList<>();
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);

        // Display fans
        System.out.println("Displaying all fans in the collection:");
        displayFans(fans);

        // Display a single fan
        System.out.println("\nDisplaying a single fan:");
        displayFan(fan1);
    }
}