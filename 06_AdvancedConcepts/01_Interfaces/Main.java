public class Main {
    public static void main(String[] args) {
        /* 
        Interfaces are similar to classes and contain only functions without implementation
        */
        Apparel a1 = new Apparel("shirt", 25.0, 0.0, "new");
        Apparel a2 = new Apparel("pants", 50.0, 0.25, "outlet");

        Electronics e1 = new Electronics(30, "keyboard", 10.0, false);
        Electronics e2 = new Electronics(100, "cable", 2.5, true);

        System.out.println(a1.printIt()); // Welcome at Apparel Department:
        System.out.println(a1); // - Name: shirt | Discount: 0.0 | Price: 25.0
        System.out.println(a2); // - Name: pants | Discount: 0.25 | Price: 37.5

        System.out.println(e1.printIt()); // Welcome at Electronics Department:
        System.out.println(e1); // - Name: keyboard | Count: 30 | Price: 40.0
        System.out.println(e2); // - Name: cable | Count: 100 | Price: 252.0



    }
    
}
