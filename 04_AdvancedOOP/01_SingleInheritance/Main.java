public class Main {
    public static void main(String[] args) {
        /* 
        1. Single Inheritance: son (1 subclass) inherited from father (superclass)
        */
        Father father = new Father("Ahmed", "Zaied");
        Son son = new Son("Ali", "Ahmed"); 
        father.print();
        son.print();

        /*
        RESULT:
        First Name: Ahmed | Last Name: Zaied
        First Name: Ali | Last Name: Ahmed
        */

        /*
        2. Multi-Level Inheritance: son inherited from father who inherited from grandfather.
        */

        /* 
        3. Hierarchical Inheritance: son and daughter (2 subclasses) inherited from father (super class)
        */
    }
}