
// Son is inherited from Father using "extends":
public class Son extends Father {  
    public Son(String firstName, String lastName) {
        // "super" is used to inherit constructor, methods, and all properties from class Father
        super(firstName, lastName); 
    }
}