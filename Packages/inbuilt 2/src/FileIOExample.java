import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "example.txt";

        try {
            // Writing to a file
            System.out.println("Enter text to write into the file:");
            String userInput = scanner.nextLine();

            FileWriter writer = new FileWriter(filename);
            writer.write(userInput);
            writer.close();
            System.out.println("Data successfully written to " + filename);

            // Reading from the file
            System.out.println("\nReading the content of the file:");
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
