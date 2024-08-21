package DeadlockPrograms;
abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Outputs: The dog barks
        myDog.sleep();  // Outputs: The animal is sleeping
    }
}

