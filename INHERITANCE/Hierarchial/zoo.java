class Animal {
    public Animal() {
        System.out.println("Animal class created");
    }

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog class created");
    }

    public void bark() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("Cat class created");
    }

    public void meow() {
        System.out.println("The cat meows");
    }
}

public class zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
