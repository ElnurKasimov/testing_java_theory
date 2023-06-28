package MultiThreading;

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        final DataHolder dataHolder = new DataHolder();

        // Thread 1: Producer
        Thread producerThread = new Thread(() -> {
            synchronized (dataHolder) {
                try {
                    // Wait until notified by the consumer
                    dataHolder.wait();

                    // Produce data and notify the consumer
                    dataHolder.setData("Hello, Consumer!");
                    dataHolder.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2: Consumer
        Thread consumerThread = new Thread(() -> {
            synchronized (dataHolder) {
                try {
                    // Notify the producer to start producing
                    dataHolder.notify();

                    // Wait until notified by the producer
                    dataHolder.wait();

                    // Consume the data produced by the producer
                    String data = dataHolder.getData();
                    System.out.println("Consumer received: " + data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the threads
        System.out.println("Launching ProducerThread");
        producerThread.start();
        System.out.println("Launching ConsumerThread");
        consumerThread.start();
    }
}

class DataHolder {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

