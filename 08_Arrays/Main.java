public class Main
{
    public static void main(String[] args)
    {
        // Define Array:
        // - method 1: 
        int[] array1 = {1,2,3,4,5,6,7,8,-9,0};
        int value0 = array1[0];
        int value5 = array1[5];
        System.out.println(value0 + " - " + value5);

        // - method 2: 
        int[] array2 = new int[10]; // this only books space in memory (filled with zeros). 
        array2[0] = 1; 
        array2[1] = 2; 
        array2[2] = 3; 
        array2[3] = 4; 
        array2[4] = 5; 
        array2[5] = 6;
        System.out.println(array2[20]); 

        // Arrays Propeties: 
        int length = array1.length;
        System.out.println(length); 
    }
}