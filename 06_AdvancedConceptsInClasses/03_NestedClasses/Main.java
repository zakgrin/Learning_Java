public class Main {
    public static void main(String[] args) {
        
        // Create Class: 
        Car myCar = new Car("Tiguan", 4);
        System.out.println(myCar);

        // Create Nested Class: 
        Car.Tires myTires = myCar.new Tires();
        myTires.printNumberOfTires();
    }
}
