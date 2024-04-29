// First interface
interface Waterborne {
    void swim();
}

// Second interface
interface Landborne {
    void walk();
}

// Superclass
class Animal {
    public void breathe() {
        System.out.println("Breathing...");
    }
}

// Subclass that extends Animal and implements both interfaces
class Amphibian extends Animal implements Waterborne, Landborne {
    public void swim() {
        System.out.println("Swimming in water...");
    }

    public void walk() {
        System.out.println("Walking on land...");
    }

    // Additional method specific to Amphibian
    public void croak() {
        System.out.println("Croaking...");
    }
}

// Main class to demonstrate the behavior
public class MultipleInterfaceDemo {
    public static void main(String args[]) {
        Amphibian frog = new Amphibian();

        // Calling methods from the interfaces
        frog.swim();
        frog.walk();

        // Calling method from the superclass
        frog.breathe();

        // Calling method of Amphibian class
        frog.croak();
    }
}
