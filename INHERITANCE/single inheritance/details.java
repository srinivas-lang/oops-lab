
class Person {
    String name;

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNumber;

    void showDetails() {
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class details {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aarav";
        s.rollNumber = 101;

        s.displayInfo();    
        s.showDetails();    
    }
}
