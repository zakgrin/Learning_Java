import java.util.ArrayList; 

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
        System.out.println(array2[9]); 

        // Arrays Propeties: 
        int length = array1.length;
        System.out.println(length); 
        
        // Multiple Arrays: 
        int[][] array3 = {{1,2,3,4},
                          {5,6,7,8}};
        System.out.println(array3[0][0]);

        // ArrayList: can be expanded!
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(32);
        myArrayList.add(100);
        System.out.printf("Array List [1] = ");
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.size()); 
        myArrayList.remove(2);
        System.out.println(myArrayList.size()); 
    }
}