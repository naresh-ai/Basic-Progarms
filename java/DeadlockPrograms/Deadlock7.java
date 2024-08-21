package DeadlockPrograms;

public class Deadlock7 {

    static String name="anana";
    static String name2="mamman";

    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                synchronized  (name){
                    System.out.println("Thread lock 1--> sstrng 1");
                }
            }

        };

    }
}
