package SoftServe.Sprint7.Theory;

public class MyThread extends  Thread {
    private int number;
    private int pause;

    public  MyThread(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread " + number);
        }
    }
}
