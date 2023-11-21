package MultiThreading.ThreadOrder;

class HelloThread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello from Thread-2");
    }
}
