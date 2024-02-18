/**
 * Design a Java class named 'Car' to represent a car. Include attributes like 'make', 'model' and 'year'.
 * Create a constructor to initialize these attributes. Add a method named 'startEngine' that prints a message like
 * "The car is now running" Add another method to calculate the mileage of the car by giving inputs like input
 * fuel size (litres) and kilo meters run. In your main program, create an instance of the 'Car' class,
 * set its attributes, and call the 'startEngine' method and 'carMileage' to find the mileage of the car.
 */

public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Start engine method
    public void startEngine() {
        System.out.println("The car is now running.");
    }

    // Calculate mileage method
    public double calculateMileage(double fuelSizeLitres, double kilometersRun) {
        // Assuming car gets 10 km/liter
        double averageMileage = 10;
        double mileage = kilometersRun / fuelSizeLitres * averageMileage;
        return mileage;
    }

    // Main method (example usage)
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2023);

        // Start the engine
        myCar.startEngine();

        // Calculate and print mileage
        double fuelSize = 50.0; // Input fuel size in litres
        double kilometers = 400.0; // Input kilometers run
        double mileage = myCar.calculateMileage(fuelSize, kilometers);
        System.out.println("Mileage: " + mileage + " km/liter");
    }
}
