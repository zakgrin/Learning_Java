public class Main{
    public static void main(String[] args){
        
        int i = 0; 

        // While Loop:
        while ( i < 5 )
        {
            System.out.println(i++);
        }

        // Do While Loop:
        int account = 100;
        do
        {
            account -= 10; 
            System.out.printf("%d %s - ", 10, "given");
            System.out.printf("%d %s \n", account, "account ");

        } while (account > 0 );

        // For Loops: 
        for (int j=0; j<10; j++)
        {
            System.out.println("number: " + j);
        }
    }
}