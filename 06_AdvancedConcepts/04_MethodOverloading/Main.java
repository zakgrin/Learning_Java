public class Main {
    public static void main(String[] args) {
        /*
        Method Overloading is used when mutltiple function (or contructors): 
        - defined with the same name multiple times but with different number of variables.
        */
        // Constructors with different number of variables: 
        TimeOverload t1 = new TimeOverload();
        System.out.println(t1);

        TimeOverload t2 = new TimeOverload(6);
        System.out.println(t2);
        
        TimeOverload t3 = new TimeOverload(6, 30);
        System.out.println(t3);

        TimeOverload t4 = new TimeOverload(6, 30, 40);
        System.out.println(t4);
    }
}