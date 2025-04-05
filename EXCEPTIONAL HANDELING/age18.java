public class age18 {
    public static void main(String[] args) {
        try {
            checkAge(11);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught error: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote");
        }
        System.out.println("Access granted. Eligible to vote.");
    }
}
