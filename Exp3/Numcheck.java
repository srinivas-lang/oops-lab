import java.util.Scanner;

public class Numcheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("to check num ");
        int a = scanner.nextInt();

        if (a >0) {
            System.out.println("positive");
        } else if (a<0) {
            System.out.println("Negative");
        } else if (a==0) {
            System.out.println("zero");
        } 
        else {
            System.out.println("unknown entry");
        }
    }
}