import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int a = scanner.nextInt();

        if (a >= 90) {
            System.out.println("Grade: A");
        } else if (a >= 80) {
            System.out.println("Grade: B");
        } else if (a >= 70) {
            System.out.println("Grade: C");
        } else if (a >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}