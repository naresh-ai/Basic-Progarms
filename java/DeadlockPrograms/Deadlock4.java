package DeadlockPrograms;

public class Deadlock4 {

    class A {
        synchronized void methodA(B b) {
            System.out.println("Thread1: Locked A");
            try { Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Thread1: Trying to lock B");
            b.last();
        }

        synchronized void last() {
            System.out.println("Inside A.last()");
        }
    }

    class B {
        synchronized void methodB(A a) {
            System.out.println("Thread2: Locked B");
            try { Thread.sleep(100);
             }
            catch (InterruptedException e) {}
            System.out.println("Thread2: Trying to lock A");
            a.last();
        }

        synchronized void last() {
            System.out.println("Inside B.last()");
        }
    }

    public class DeadlockExample implements Runnable {
        A a = new A();
        B b = new B();

        DeadlockExample() {
            Thread t = new Thread(this);
            t.start();
            a.methodA(b); // main thread locks A and then tries to lock B
        }

        public void run() {
            b.methodB(a); // new thread locks B and then tries to lock A
        }

        public static void main(String[] args) {
            new Deadlock4();
        }
    }

}
