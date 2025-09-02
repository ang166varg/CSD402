/*
 * Author: Angela Vargas
 * Course: CSD402
 * Assignment: 6.2 Programming Assignment
 */

public class Fan {
    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (default values)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString() method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON, speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan is OFF, color: " + color + ", radius: " + radius;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Intro message for output
        System.out.println("This program demonstrates a Fan class with fields, constructors, methods, and objects.");

        // Fan created using default constructor
        Fan defaultFan = new Fan();

        // Fan created using argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        // Displaying both fans
        System.out.println("\nDefault Fan:");
        System.out.println(defaultFan.toString());

        System.out.println("\nCustom Fan:");
        System.out.println(customFan.toString());

        // Changing some values to test setters
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setColor("black");
        defaultFan.setRadius(8);

        System.out.println("\nUpdated Default Fan:");
        System.out.println(defaultFan.toString());
    }
}