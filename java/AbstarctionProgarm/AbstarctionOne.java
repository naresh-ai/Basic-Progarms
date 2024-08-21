package AbstarctionProgarm;


abstract class Animal2 {

}
    abstract class Animal {
        // Abstract method (does not have a body)
        public abstract void animalSound();

        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    public class AbstarctionOne extends Animal2 {
        public void sleep() {
            System.out.println("Ok Abstaction");
        }
    }

