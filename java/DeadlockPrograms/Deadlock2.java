package DeadlockPrograms;

public class Deadlock2  extends Thread{
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                //int a=10,b=89;
                //int c=a+b;
                System.out.println("Thread 1 acquired resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {

                    System.out.println("Thread 1 acquired resource2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
            //    int a=200,b=89;
             //   int c= a-b;
                System.out.println("Thread 2 acquired resource2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 2 acquired resource1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
