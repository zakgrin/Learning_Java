import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter; 
import java.io.BufferedWriter; 

public class WritingFile {
    public static void main(String[] args) throws Exception {
        /*
        1. Create file class with printWriter
        */
        File file = new File("output_1.txt");
        PrintWriter printWriter = new PrintWriter(file);
        // start writing in the file: 
        printWriter.println("Welcome to the new file");
        printWriter.println("This a great file");
        printWriter.close();

        /*
        2. Create file class with bufferedWriter (faster!)
        */
        File file_ = new File("output_2.txt");
        FileWriter fileWriter = new FileWriter(file_);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // start writing in the file: 
        bufferedWriter.write("Welcome to the new file\n");
        bufferedWriter.newLine();
        bufferedWriter.write("This is a great file");
        bufferedWriter.close();
    }
}