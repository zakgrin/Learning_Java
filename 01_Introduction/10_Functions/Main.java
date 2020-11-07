public class Main{
    public static void main(String[] args) {
        // Function Call: 
        String name = getFullName("Zaka", "Grin");
        System.out.println(name);
        print();
    }

    // Function Definition:     
    // Function to return a string: 
    public static String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    
    void print() {
        //
    }

}