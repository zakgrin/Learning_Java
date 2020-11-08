public class Car extends Vehicle {
    public Car(String madeIn, int numberOfWheels, String color) {
        super(madeIn, numberOfWheels, color);
    }

    @Override
    public void print() {
        //super.print();
        System.out.println("This is 'Override' print function in class Car");
        // superclass variables can be accessed directly since they are "protected" not "private": 
        System.out.println(" - made in: " + madeIn);
        System.out.println(" - number of wheels: " + numberOfWheels);
        System.out.println(" - color: " + color);
    }
}