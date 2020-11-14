public class Main {
    public static void main(String[] args) {
        // Strings are not immutable in Java.
        // StringBuilder class can be used to create mutable strings.
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10); // capacity
        StringBuilder sb3 = new StringBuilder("Zakariya");

        System.out.println("sb1: " + "(" + sb1.toString() + ")");
        System.out.println("sb2: " + "(" + sb2.toString() + ")");
        System.out.println("sb3: " + "(" + sb3.toString() + ")");

    }
}
