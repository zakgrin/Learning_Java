public class Son extends Father { 
// Son is inherited from Father using "extends":
    public Son(String firstName, String lastName) {
        // "super" is used to inherit constructor, methods, and all properties from class Father
        super(firstName, lastName); 
    }
}