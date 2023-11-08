package file_management;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "file1.txt";
        
        try {
            // Create a FileWriter to write to the file
            FileWriter writer = new FileWriter(fileName);
            
            // Write some data to the file
            writer.write("Hello, World!\n");
            writer.write("This is an example of file handling in Java.");
            
            // Close the FileWriter
            writer.close();
            
            // Create a FileReader to read from the file
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            
            // Read and print the contents of the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the FileReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
