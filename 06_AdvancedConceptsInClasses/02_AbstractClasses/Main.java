public class Main {
    public static void main(String[] args) {
        /*
        Abstract classes: 
        - to define the implementation details in subclasses instead of the main class. 
        - defined with 'public abstract class ClassName'.
        - can contain normal functions 'public void print()'
        - can contain abstract functions 'public abstract void print()'.

        Interface vs. Abstract Class: 
        - Allows for multiple inheritance | Does not allow
        - Does not cotain constructors | Can have constructors
        - Does not allow for function definition and implementation | allow for both!
        - Funcions can only by public | Functions can be public, private, protected
        */
        JavaCourse java = new JavaCourse(); // subclass of Course.java
        java.printWelcomeMessage();
        java.printName();        
        // You are welcome in Java Course
    }
}
