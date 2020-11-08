import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader; 

public class ReadingFile{
    public static void main(String[] args) throws Exception {
        /*
        1. Create file class to scan it! 
        */
        File file = new File("file.txt");
        // Create scanner class with exception!
        Scanner scanner = null; 
        try {
            scanner = new Scanner(file); 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Loop through the file
        long initTime = System.currentTimeMillis();
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        long finalTime = System.currentTimeMillis(); 
        System.out.println("time: " + (finalTime-initTime) + " miliseconds");

        /*
        2. Create buffer class (more efficient especially for big data)
        */
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
        // we avoid writing sepecific eception by adding 'throws Exception'
        // BufferedReader bufferedReader = null;
        // try {
        //     bufferedReader = new BufferedReader (new FileReader("file.txt"));
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        String data;
        initTime = System.currentTimeMillis();
        while ( (data = bufferedReader.readLine()) != null) {
            System.out.println(data);
        }
        finalTime = System.currentTimeMillis(); 
        System.out.println("time: " + (finalTime-initTime) + " miliseconds");
    } 
}