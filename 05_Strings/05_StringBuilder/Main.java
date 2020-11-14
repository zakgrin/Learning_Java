public class Main {
    public static void main(String[] args) {

        // Strings are immutable (not mutable) in Java.
        // StringBuilder class can be used to create mutable strings.
        StringBuilder sb1 = new StringBuilder(); 
        StringBuilder sb2 = new StringBuilder(10); // capacity
        StringBuilder sb3 = new StringBuilder("Zakariya");
        // Properties: 
        System.out.println("sb1: " + "(" + sb1.toString() + ")"); // sb1: ()
        System.out.println("sb2: " + "(" + sb2.toString() + ")"); // sb2: ()
        System.out.println("sb3: " + "(" + sb3.toString() + ")"); // sb3: (Zakariya)
        System.out.println("length() = " + sb3.length()); // length() = 8
        System.out.println("capacity() = " + sb3.capacity()); // capacity() = 24
        sb3.ensureCapacity(5); // to reduce capacity (can't be reduced)
        sb3.ensureCapacity(75); // to provide additional capacity
        sb3.setLength(4); // 
        System.out.println("sb3: " + "(" + sb3.toString() + ")"); // sb3: (Zaka)
        System.out.println("length() = " + sb3.length()); // length() = 4
        System.out.println("capacity() = " + sb3.capacity()); // capacity() = 75
        // Index: 
        System.out.println("charAt(2): " + sb3.charAt(2)); // charAt(2): k
        // Substring: 
        char[] charArray = new char[sb3.length()];
        sb3.getChars(1,sb3.length(), charArray, 0);
        System.out.println(charArray); // aka
        // Loop in Substring:
        for (char c: charArray)
            System.out.println(c);
        // Replace char
        sb3.setCharAt(1, 'n');
        System.out.println(sb3); // Znka
        // Reverse: 
        System.out.println(sb3.reverse()); // aknZ
        // Append: (add at the end)
        sb3.append(" Yes!");
        System.out.println(sb3); // aknZ Yes!
        sb3.append('-').append('|').append(10).append('\n');
        System.out.println(sb3); // aknZ Yes!-|10
        // Insert: (add at a selected location)
        sb3.insert(4, " No!");
        System.out.println(sb3); // aknZ No! Yes!-|10
        // delete: 
        sb3.delete(4, sb3.length());
        System.out.println(sb3); // aknZ
        
    }
}
