public class Main {
    public static void main(String[] args) {

        // Compare Strings: (Exactly the same!)
        String s1 = new String("welcome");
        String s2 = "welcome";
        String s3 = new String("welcome");
        String s4 = "welcome";
        equalsCompare(s1, s2); // texts are the same!
        equalsCompare(s1, s3); // texts are the same!
        equalsCompare(s2, s4); // texts are the same!
        equalCompare(s1, s2); // texts are different!
        equalCompare(s1, s3); // texts are different!
        equalCompare(s2, s4); // texts are the same!

        // Compare Stirngs: (Not case Sensitive!)
        String s5 = "Welcome";
        equalsCompare(s2, s5); // texts are the different!
        equalCompare(s2, s5);  // texts are the different!
        equalsIgnoreCaseCompare(s2, s5);  // texts are the same!

    }

    public static Boolean equalsCompare(String s1, String s2) {
        System.out.printf("equals compare (s1.equals(s2)) s1=" + s1 + ", s2=" + s2 + ": ");
        if (s1.equals(s2)) { // used when Strings are constructed differently! 
        // '.equals()' compares by value and works even when Strings are constructed differently.
            System.out.println("texts are the same!");
            return true;
        }
        else {
            System.out.println("texts are different!");
            return false;
        }
    }
    public static Boolean equalCompare(String s1, String s2) {
        System.out.printf("Equal '==' compare (s1 == s2) s1=" + s1 + ", s2=" + s2 + ": ");
        if (s1 == s2) { // used fot Strings created without using new String (constructor) 
        // '==' compares by reference in memory. 
            System.out.println("texts are the same!");
            return true;
        }
        else {
            System.out.println("texts are different!");
            return false;
        }
    }
    public static Boolean equalsIgnoreCaseCompare(String s1, String s2) {
        System.out.printf("equalsIgnoreCase compare (s1.equals(s2)) s1=" + s1 + ", s2=" + s2 + ": ");
        if (s1.equalsIgnoreCase(s2)) { // used when Strings are constructed differently! 
        // '.equals()' compares by value and works even when Strings are constructed differently.
            System.out.println("texts are the same!");
            return true;
        }
        else {
            System.out.println("texts are different!");
            return false;
        }
    }
       
}
