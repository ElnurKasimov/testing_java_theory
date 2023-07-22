package SoftServe.Sprint7.Practice.Task4;

class MyThreads {
    public final static Object den = new Object();
    public final static Object ada = new Object();
    public static int n;
    public static int m;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                try {
                    synchronized (den) {
                        for (int i = 0; i < 5; i++, n++)
                            System.out.println("Thread1 n = " + n);
                            den.wait(1000);
                        synchronized (ada) {
                            ada.notify();
                            for (int i = 0; i < 5; i++, m++)
                                System.out.println("Thread1 m = " + m);
                            System.out.println("Thread1 success!");
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                try {
                        synchronized (ada) {
                            ada.wait(1000);
                            for (int i = 0; i < 5; i++, m++)
                                System.out.println("Thread2 m = " + m);
                            synchronized (den) {
                                for (int i = 0; i < 5; i++, n++)
                                    System.out.println("Thread2 n = " + n);
                                System.out.println("Thread2 success!");
                                den.notify();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        t2.start();
        t1.start();
    }
}
