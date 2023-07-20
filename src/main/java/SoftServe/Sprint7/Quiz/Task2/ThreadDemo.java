package SoftServe.Sprint7.Quiz.Task2;

public class ThreadDemo implements Runnable{
    int x=0, y=0;
    int addX() {
        x++;
        return x;
    }
    int addY() {
        y++;
        return y;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + addX() + addY());
        }
    }
}
