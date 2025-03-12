import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Rate of Interest (%): ");
        float rate = sc.nextFloat();

        System.out.print("Enter Time (in years): ");
        float time =sc.nextFloat();

        // Calculation
        float Interest = (principal * rate * time) / 100;

        // Output
        System.out.println("Interest: " + Interest);
        System.out.println("Total Amount: " + (principal + Interest));
        sc.close();
    }
}