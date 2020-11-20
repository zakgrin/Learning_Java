public class Main {
    public static void main(String[] args) {
        /* 
        1. Single Inheritance: son inherited from father
        e.g. Truck inherited form Vehicle
        */
        Truck truck_1 = new Truck("France", 6, "White");
        truck_1.print(); // Type: Truck | Made in: France | Number of wheels: 6 | Color: White
        
        /*
        2. Multi-Level Inheritance: son inherited from father who inherited from grandfather.
        e.g. Suv or Sedan from Car from Vehicle
        */
        /* 
        3. Hierarchical Inheritance: son and daughter (2 subclasses) inherited from father (super class)
        e.g. Suv and Sedan from Car
        */
        Sedan sedan_1 = new Sedan("Germany", 4, "Black");
        Suv suv_1 = new Suv("Germany", 4, "Blue");
        // Note that the print function of class Car was changed (Override) compared to the superclass Vehicle.
        // The override print function was inherited to the subclasses Sedan and Suv. 
        sedan_1.print();
        suv_1.print();

        
        /*
        RESULT:

        Type: Truck | Made in: France | Number of wheels: 6 | Color: White
        This is 'Override' print function in class Car
        - made in: Germany
        - number of wheels: 4
        - color: Black
        This is 'Override' print function in class Car
        - made in: Germany
        - number of wheels: 4
        - color: Blue

        */ 

    }
}