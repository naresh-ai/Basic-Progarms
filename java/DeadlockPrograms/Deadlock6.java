package DeadlockPrograms;

public class Deadlock6 {
    static String n1="nano";
    static String n2="nana";

    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                synchronized (n1){
                    System.out.println("Thread 1 Lock --> Resorce1"+" "+n1);
                    synchronized (n2){
                        System.out.println("THread 1 lock -->Resource2 90");
                    }
                }
            }
        }; Thread t2=new Thread(){
          public void run(){
              synchronized (n2){
                  System.out.println("Thread 2 lock -->Resource 2 3"+ " "+ n2);
                  synchronized (n1){
                      System.out.println("THread 2 lock-->Resource 1  7888");
                  }
              }
          }
        };
        t1.start();
        t2.start();
    }
}
