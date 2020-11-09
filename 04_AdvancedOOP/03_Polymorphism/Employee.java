public abstract class Employee {
    // abstract to allow polymorphism
    private String name;
    private String idNumber;
    
    // Constructor
    public Employee(String name, String idNumber) {
        setName(name);
        setIdNumber(idNumber);
    }

    // Getters:
    public String getName() {
        return name;
    }
    public String getIdNumber() {
        return idNumber;
    }

    // Setters:
    public void setName(String name) {
        this.name = name;
    }  
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // This is inherited form the main superclass "Object": 
    @Override
    public String toString() {
        return String.format(" - Name: %s\n - ID Number: %s\n", getName(), getIdNumber()); 
        // note that format here is simillar printf()
    }

    // Abstract functions have no code inside (the implementation depends on subclasses!)
    public abstract double earnings();

}
