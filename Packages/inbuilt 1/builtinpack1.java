import java.util.Scanner;  
import java.io.File;       
import java.time.LocalDate; 

class builtinpack1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File exists: " + file.getName());
        } else {
            System.out.println("File does not exist.");
        }
        

        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        sc.close();
    }
}
