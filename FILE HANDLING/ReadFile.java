import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "\"C:\\Users\\sasik\\OneDrive\\Documents\\New Text Document.txt\"";
        
        try {
            FileReader r = new FileReader(path);
            BufferedReader reader = new BufferedReader(r);
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException ex) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
