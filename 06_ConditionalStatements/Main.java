public class Main {
    public static void main(String[] args) {
        // variables: 
        int num1 = 20; 
        int num2 = 40; 
        // if:
        if (num1 > num2) {
            System.out.println("num1 > num2");
        }
        else if (num1 == num2) {
            System.out.println("num1 = num2");
        }
        else {
            System.out.println("num1 < num2");
        }
        // short if: 
        System.out.println((num1>num2)? "true":"false");
        // switch: 
        int myVal = 10; 
        switch(myVal){
            case 10: 
                System.out.println(10);
                break;
            case 20: 
                System.out.println(20);
                break; 
            default: 
                System.out.println("Non of above");
        }
    }
}