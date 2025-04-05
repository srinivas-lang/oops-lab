import java.util.Scanner;

class ScreenTime {
    void time(int apps) {
        System.out.println("Screen time: " + (120 - apps * 10) + " minutes");
    }

    void time(int apps, boolean saver) {
        if (saver) {
            System.out.println("Screen time (Battery Saver ON): " + (120 - apps * 5) + " minutes");
        } else {
            time(apps);
        }
    }
}

public class Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num of apps");
        int apps = sc.nextInt();
        System.out.print("battery saver on or not");
        boolean saver = sc.nextBoolean();

        ScreenTime s = new ScreenTime();
        s.time(apps);
        s.time(apps, saver);

        sc.close();
    }
}
