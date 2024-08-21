package DeadlockPrograms;

public class Deadlock5 {

    static String name="namo";
    static String nameclass="A";


    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                synchronized (name){
                    try {
                        System.out.println("Thread lock name" + " " + name);
                        Thread.sleep(1000);
                    }catch (Exception e){
                        System.out.println("sleep is working");
                    }
                }synchronized (nameclass){







                                        System.out.println("Thread lock nameclass" + nameclass);
                }
            }
        };
        Thread t2=new Thread(){
          public void run(){
              synchronized (nameclass){
                  System.out.println("Thread lock 2" + name);
              }synchronized (name){
                  System.out.println("Thread lock 3" + nameclass);
              }
          }
        };
        t1.start();
        t2.start();

    }

    }

