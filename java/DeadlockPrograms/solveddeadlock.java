package DeadlockPrograms;

public class solveddeadlock {
    public static void main(String[] args) {
        final Object obje1=new Object();
        final Object obje2=new Object();

        Thread t1=new Thread(){
            public  void run(){
                synchronized (obje1){
                    System.out.println("Thread 1: Locked obj1");

                    try{
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (obje2){
                        System.out.println("Thread 1 : locked obje2");
                    }
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                synchronized (obje1){
                    System.out.println("Thread 2 : locked obje 1");
                     try {
                         Thread.sleep(100);
                     }catch (InterruptedException e){
                                e.printStackTrace();
                     }
                     synchronized (obje2){
                         System.out.println("Thread 2 : locked obj 2");
                     }
                }
            }

        };
        t1.start();
        t2.start();

    }
}
