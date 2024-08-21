package DeadlockPrograms;

public class ProducerConsumerExample {
        public static void main(String[] args) {
            Producerconsumer sharedResource = new Producerconsumer();
            Thread T1 = new Thread();
            Thread T2 = new Thread();

            T1.start();
            T2.start();
        }
    }
