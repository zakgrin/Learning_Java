public class Car {
    String name; 
    Integer wheels;

    public Car(String name, Integer wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return " Car Name: " + name + 
               " | Number of Wheels: " + wheels; 
    }

    class Tires {
        public void printNumberOfTires() {
            System.out.println("Number of Tires: " + (wheels+1));
        }
    }
}
