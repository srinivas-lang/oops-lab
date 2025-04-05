public class what1 {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.makeSound();
        myCat.sleep();
    }
}
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows...");
    }
}

