import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
        1. Create Scanner class for input
            - Scanner.next(): for a string input (without spaces).
            - Scanner.nextLine(): for a string input (with spaces).
            - Scanner.nextInt(): for an integer input.
            _ Scanner.nextDouble(): for a double input.
        */
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your first name: ");
        String firstName = input.next(); 
        System.out.printf("Enter your last name: ");
        String lastName = input.next();
        System.out.printf("Enter your age: ");
        int age = input.nextInt(); 

        System.out.println("First Name: " + firstName + " | " +
                           "Last Name: " + lastName + " | " +
                           "Age: " + age);

        /*
        Result:
        Enter your first name: Ahmed
        Enter your last name: Moha
        Enter your age: 33
        First Name: Ahmed | Last Name: Moha | Age: 33 
        */


    }
}