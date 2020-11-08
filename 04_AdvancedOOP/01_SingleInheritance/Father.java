public class Father {
    // Properties: 
    private String firstName;
    private String lastName;
    // Constructor: 
    public Father(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Supporters:
    void print() {
        System.out.println("First Name: " + firstName + " | " +
                           "Last Name: " + lastName);
    }
}