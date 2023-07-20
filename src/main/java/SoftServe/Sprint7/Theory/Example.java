package SoftServe.Sprint7.Theory;

public class Example {
    public static void main(String[] args) {
        Thread t1 = new MyThread(1, 100);
        Thread t2 = new MyThread(2, 250);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main stopped");
    }
}
