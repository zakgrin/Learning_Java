// This is the main class for: Car (Sedan, Suv), Truck, Motorcycle.
public class Vehicle {
    // protected instead of private to allow inherited classes to access them with "super"
    protected String madeIn;
    protected int numberOfWheels;
    protected String color;

    // Constructor with input: 
    public Vehicle(String madeIn, int numberOfWheels, String color) {
        this.madeIn = madeIn;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }
    
    // Constructor with default: 
    public Vehicle() {

    }
    
    // Supporters: 
    public void print() {
        System.out.println("Type: " + getClass().getName() + " | " +
                           "Made in: " + madeIn + " | " + 
                           "Number of wheels: " + numberOfWheels + " | " + 
                           "Color: " + color); 
    }
}