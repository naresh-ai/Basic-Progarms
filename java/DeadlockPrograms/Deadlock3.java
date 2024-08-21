package DeadlockPrograms;

public class Deadlock3 {
    // Java program to illustrate Deadlock
// where deadlock occurs

// Importing required packages

    // Class 1
// Helper class

        // Method 1 of this class
        // Synchronized method
        public synchronized void last()
        {

            // Print and display statement
            System.out.println("Inside A, last() method");
        }

        // Method 2 of this class
        // Synchronized method
        public synchronized void d1(B b)
        {
            System.out.println(
                    "Thread1 start execution of d1() method");

            // Try block to check for exceptions
            try {

                // Putting the current thread to sleep for
                // specific time using sleep() method
                Thread.sleep(2000);
            }

            // Catch block to handle the exceptions
            catch (InterruptedException e) {
                // Display the exception on the console
                System.out.println(e);
            }

            // Display statement
            System.out.println(
                    "Thread trying to call B's last() method");

            // Calling the method 1 of this class as created
            // above
            b.last();
        }
    }

    // Class 2
// Helper class B
    class B {

        // Method 1 of this class
        public synchronized void last()
        {

            // Display statement only
            System.out.println("Inside B, last() method");
        }

        // Method 2 of this class
        // Synchronized the method d2
        public synchronized void d2(Deadlock3 a)
        {

            // Display message only
            System.out.println(
                    "Thread2 start execution of d2() method");

            // Try block to check for exceptions
            try {

                // Putting the current thread to sleep for
                // certain time using sleep() method
                Thread.sleep(2000);

                // Catch block to handle the exceptions
            }
            catch (InterruptedException e) {

                // Display the exception on the console
                System.out.println(e);
            }

            // Display message only
            System.out.println(
                    "Thread2 trying to call A's last method");

            // Again calling the last() method inside this class
            a.last();
        }
    }

    // Class 3
// Main class
// Deadlock class which is extending Thread class
    class GFG extends Thread {

        // Creating object of type class A
        Deadlock3 a = new Deadlock3();

        // Creating object of type class B
        B b = new B();

        // Method 1
        public void m1()
        {

            // Starting the thread
            this.start();

            // Calling d1 method of class A
            a.d1(b);
        }

        // Method 2
        // run() method for the thread
        public void run()
        {

            // Calling d2 method of class B
            b.d2(a);
        }

        // Method 3
        // Main driver method
        public static void main(String[] args)
        {

            // Creating object of this class
            GFG deadlock = new GFG();

            // Calling m1 method
            deadlock.m1();
        }
    }


