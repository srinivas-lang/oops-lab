import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordCheck {

    public static void check(String password) throws WeakPasswordException {
        if (password.length() < 6) {
            throw new WeakPasswordException("Password too short! Must be at least 6 characters.");
        }
        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            check(pass);
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Check done.");
            sc.close();
        }
    }
}
