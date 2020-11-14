public class Main {

    public static void main(String[] args) {
        
        // Variables: 
        String string = "Zakariya"; // same as: = new String("Zakariya");
        char[] charArray = {'Z','a', 'k', 'a', 'r', 'i', 'y', 'a'};
        
        // Contructor: 
        String s1 = new String(string); // same as: = "";
        String s2 = new String(charArray);
        String s3 = new String(charArray, 3, 4);
        
        // Print: 
        System.out.println(s1); // Zakariya
        System.out.println(s2); // Zakariya
        System.out.println(s3); // ariy
        
        // String properties:
        System.out.println(s1.length()); // 8
        // System.out.println(charArray.length()); // not available for char arrays! 
        System.out.println(s1.charAt(2)); // k
        // replace specific letters in char arrays with string values 
        s1.getChars(2, 5, charArray, 1);
        System.out.println(charArray); // Zkarriya



        String str1 = "Ahmed";
        String str2 = "barmej";
        String str3 = "BaRmEj";
        String str4 = "  java  ";

        System.out.println(str1.replace('d', 't')); // Ahmet
        System.out.println(str2.toUpperCase()); // BARMEJ
        System.out.println(str3.toLowerCase()); // barmej
        System.out.println("-" + str4.trim() + "-"); // -java-

        char[] myCharArray = str2.toCharArray();
        for (char c: myCharArray) // for each loop
            System.out.println(c); 
            /* 
            b
            a
            r
            m
            e
            j
            */
        
    }
}