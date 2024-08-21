package DeadlockPrograms;

public class Producerconsumer
{
    private int data;
        private boolean isDataAvailable = false;

        public synchronized void produce(int value) {
            while (isDataAvailable) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer interrupted");
                }
            }
            data = value;
            isDataAvailable = true;
            System.out.println("Produced: " + data);
            notify();
        }

        public synchronized int consume() {
            while (!isDataAvailable) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Consumer interrupted");
                }
            }
            isDataAvailable = false;
            System.out.println("Consumed: " + data);
            notify();
            return data;
        }
    }

    class Producer implements Runnable {
        private final Producerconsumer resource;

        public Producer(Producerconsumer resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                resource.produce(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer sleep interrupted");
                }
            }
        }
    }

    class Consumer implements Runnable {
        private final Producerconsumer resource;

        public Consumer(Producerconsumer resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                resource.consume();
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Consumer sleep interrupted");
                }
            }
        }
    }


