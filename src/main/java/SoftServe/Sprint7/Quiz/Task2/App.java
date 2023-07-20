package SoftServe.Sprint7.Quiz.Task2;

public class App {
    public static void main(String[] args) {
        ThreadDemo obj1 = new ThreadDemo();
        ThreadDemo obj2 = new ThreadDemo();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
