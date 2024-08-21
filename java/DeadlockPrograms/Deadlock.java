package DeadlockPrograms;

public class Deadlock {
    static String s1="Satara";
    static String s2="Mumbsi";

    public static void main(String[] args) {
        Thread T1 = new Thread(){
            public void run() {

                synchronized (s1){
                    System.out.println("Thread 1 stop");
                }
                synchronized (s2){
                    System.out.println("Thread 2 stop");
                }

            }
        };
        Thread t2=new Thread()
        {
            public void run() {
                synchronized (s2) {
                    System.out.println("Thread 1 run");
                }
                synchronized (s1) {
                    System.out.println(" Thread 2 run");
                }
            }
        };
        T1.start();
        t2.start();

    }
}