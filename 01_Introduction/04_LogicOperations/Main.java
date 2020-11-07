public class Main {
    public static void main(String[] args){
        // less than
        boolean isLessThan = 10 < 2;
        System.out.println(isLessThan); 
        // equal
        boolean isEqual = 20 != 'm'; 
        System.out.println(isEqual); 
        // larger than: 
        boolean isLargerThan = 20 > 10; 
        System.out.println(isLargerThan); 

        // and
        System.out.println("and:");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        // or
        System.out.println("or:");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        // not: flips the sign! 
        System.out.println("not:");
        System.out.println(!(false || false));
        // multiple: 
        System.out.println("multiple:");
        System.out.println(!(false||false) && 1>0); 
    }
}