class Person {
    Person() {
        System.out.println("Person is created");
    }
}

class Employee extends Person {
    Employee() {
        System.out.println("Employee is created");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager is created");
    }
}

public class man {
    public static void main(String[] args) {
        Manager mgr = new Manager();
    }
}