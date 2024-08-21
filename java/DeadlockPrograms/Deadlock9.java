package DeadlockPrograms;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Deadlock9 {

    public class DeadlockDetector extends Thread {
        private final ThreadMXBean mbean = ManagementFactory.getThreadMXBean();

        public void run() {
            while (true) {
                long[] threadIds = mbean.findDeadlockedThreads();
                if (threadIds != null) {
                    ThreadInfo[] infos = mbean.getThreadInfo(threadIds);
                    for (ThreadInfo info : infos) {
                        System.err.println("Deadlock detected:");
                        System.err.println(info);
                    }
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {Thread t1=new Thread();
            Deadlock9 ss=new Deadlock9();
             t1.start();

        }
    }

// Start the deadlock detector
   //new DeadlockDetector()


}
