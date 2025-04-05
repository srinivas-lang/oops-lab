import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String message = "Hello, My name is sussy";
        
        try {
            FileWriter fw = new FileWriter("example.txt");
            fw.write(message);
            fw.close();
            System.out.println("File has been written successfully.");
        } catch (IOException ex) {
            System.out.println("Something went wrong while writing the file.");
        }
    }
}
