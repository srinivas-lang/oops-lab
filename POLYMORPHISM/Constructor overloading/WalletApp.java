import java.util.Scanner;

class Wallet {
    int id;
    double balance;
    String type;

    // Constructor without type
    Wallet(int id, double balance) {
        this.id = id;
        this.balance = balance;
        System.out.println("Wallet ID: " + id);
        System.out.println("Balance: ₹" + balance);
    }

    // Constructor with type
    Wallet(int id, double balance, String type) {
        this.id = id;
        this.balance = balance;
        this.type = type;
        System.out.println("Wallet ID: " + id);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Type: " + type);
    }
}

public class WalletApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("enter balance");
        double bal = sc.nextDouble();
        sc.nextLine();
        System.out.print("Mode of payment");
        String type = sc.nextLine();

        Wallet w1 = new Wallet(id, bal);
        System.out.println("------Overloaded Constructor------");
        Wallet w2 = new Wallet(id, bal, type);

        sc.close();
    }
}
